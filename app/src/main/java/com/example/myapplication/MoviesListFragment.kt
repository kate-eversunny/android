package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MoviesListFragment: Fragment() {

	private var moviesModel: MoviesModel = MoviesModel(MoviesDataSourceImpl())
	private lateinit var movieRecycler: RecyclerView
	private lateinit var listener: MoviesAdapter.OnItemClickListener

	companion object {
		fun newInstance(): MoviesListFragment {
			return MoviesListFragment()
		}
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)
		listener = context as MoviesAdapter.OnItemClickListener
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val view: View = inflater.inflate(R.layout.activity_movie_list, container, false)

		if (savedInstanceState != null) {
			moviesModel.setMovies(savedInstanceState.getParcelableArrayList<MovieDto>("savedMoviesList") as ArrayList<MovieDto>)
		}
		setRecyclers(view)
		return view
	}

	override fun onSaveInstanceState(outState: Bundle) {
		outState.putParcelableArrayList("savedMoviesList", moviesModel.getMovies())
		super.onSaveInstanceState(outState)
	}

	private fun setRecyclers(view: View) {
		setMoviesRecycler(view)
		setGenreRecycler(view)
	}

	private fun setMoviesRecycler(view: View) {
		movieRecycler = view.findViewById(R.id.rvMovieList)
		val movies: List<MovieDto> = moviesModel.getMovies()
		movieRecycler.adapter = MoviesAdapter(movies, listener)
		movieRecycler.layoutManager = GridLayoutManager(context, 2)

		setItemDecoration()
		setSwipeRefresh(view, movieRecycler.adapter as MoviesAdapter)
	}

	private fun setItemDecoration() {
		val itemDecoration = MovieItemDecoration(20, 0,20, 50)
		movieRecycler.addItemDecoration(itemDecoration)
	}

	private fun setSwipeRefresh(view: View, adapter: MoviesAdapter) {
		val pullToRefresh: SwipeRefreshLayout = view.findViewById(R.id.swipeContainerMovieList)
		pullToRefresh.setOnRefreshListener {
			adapter.updateData(moviesModel.updateMovies())
			pullToRefresh.isRefreshing = false
		}
	}

	private fun setGenreRecycler(view: View) {
		val genreRecycler: RecyclerView = view.findViewById(R.id.rvMovieListGenres)
		genreRecycler.adapter = GenresAdapter(getGenres())
		genreRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
	}

	private fun getGenres(): List<String> = this.resources.getStringArray(R.array.genres).toList()

}