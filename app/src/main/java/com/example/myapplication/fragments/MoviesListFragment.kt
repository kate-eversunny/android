package com.example.myapplication.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.myapplication.*
import com.example.myapplication.adapters.GenresAdapter
import com.example.myapplication.adapters.MovieItemDecoration
import com.example.myapplication.adapters.MoviesAdapter
import com.example.myapplication.model.MovieDto
import com.example.myapplication.viewModel.MoviesListViewModel
import java.lang.AssertionError

class MoviesListFragment : Fragment() {

	private lateinit var viewModel: MoviesListViewModel
	private lateinit var liveData: LiveData<ArrayList<MovieDto>>
	private lateinit var movieRecycler: RecyclerView
	private lateinit var listener: MoviesAdapter.OnItemClickListener

	override fun onAttach(context: Context) {
		super.onAttach(context)
		listener = context as MoviesAdapter.OnItemClickListener
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
		viewModel.uploadMovies()
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val view: View = inflater.inflate(R.layout.activity_movie_list, container, false)

		if (savedInstanceState != null) {
			viewModel.setMovies(
				savedInstanceState.getParcelableArrayList<MovieDto>(
					resources.getString(R.string.tag_saved_movie_list)
				) as ArrayList<MovieDto>
			)
		}
		setRecyclers(view)
		liveData = viewModel.getData()
		liveData.observe(viewLifecycleOwner, {
			(movieRecycler.adapter as MoviesAdapter).updateData(it)
		})
		return view
	}

	override fun onSaveInstanceState(outState: Bundle) {
		outState.putParcelableArrayList(
			resources.getString(R.string.tag_saved_movie_list),
			viewModel.getMovies()
		)
		super.onSaveInstanceState(outState)
	}

	private fun setRecyclers(view: View) {
		setMoviesRecycler(view)
		setGenreRecycler(view)
	}

	private fun setMoviesRecycler(view: View) {
		movieRecycler = view.findViewById(R.id.rvMovieList)
		movieRecycler.adapter = MoviesAdapter(listener)
		movieRecycler.layoutManager = GridLayoutManager(context, 2)
		setItemDecoration()
		setSwipeRefresh(view)
	}

	private fun setItemDecoration() {
		val itemDecoration = MovieItemDecoration(
			resources.getDimensionPixelSize(R.dimen.item_movie_left_offset),
			resources.getDimensionPixelSize(R.dimen.item_movie_top_offset),
			resources.getDimensionPixelSize(R.dimen.item_movie_right_offset),
			resources.getDimensionPixelSize(R.dimen.item_movie_bottom_offset)
		)
		movieRecycler.addItemDecoration(itemDecoration)
	}

	private fun setSwipeRefresh(view: View) {
		val pullToRefresh: SwipeRefreshLayout = view.findViewById(R.id.swipeContainerMovieList)
		pullToRefresh.setOnRefreshListener {
			try {
				viewModel.updateMovies()
			} catch (exception: AssertionError) {
				Log.d(
					resources.getString(R.string.tag_coroutineException),
					"Caught $exception"
				)
			}
			pullToRefresh.isRefreshing = false
			view.findViewById<TextView>(R.id.tvMovieListNoConnection).isVisible =
				viewModel.getData().value?.isEmpty() ?: true
		}
	}

	private fun setGenreRecycler(view: View) {
		val genreRecycler: RecyclerView = view.findViewById(R.id.rvMovieListGenres)
		genreRecycler.adapter = GenresAdapter(getGenres())
		genreRecycler.layoutManager =
			LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
	}

	private fun getGenres(): List<String> = this.resources.getStringArray(R.array.genres).toList()

	companion object {
		fun newInstance(): MoviesListFragment {
			return MoviesListFragment()
		}
	}
}