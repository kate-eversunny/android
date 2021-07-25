package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout


class MainActivity : AppCompatActivity(), MoviesAdapter.OnItemClickListener {

    private var moviesModel: MoviesModel = MoviesModel(MoviesDataSourceImpl())
    private lateinit var movieRecycler: RecyclerView
    private lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)
        if (savedInstanceState != null) {
            moviesModel.setMovies(savedInstanceState.getParcelableArrayList<MovieDto>("savedMoviesList") as ArrayList<MovieDto>)
        }
        setRecyclers()
        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelableArrayList("savedMoviesList", moviesModel.getMovies())
        super.onSaveInstanceState(outState)
    }

    private fun setRecyclers() {
        setMoviesRecycler()
        setGenreRecycler()
    }

    private fun setMoviesRecycler() {
        movieRecycler = findViewById(R.id.rvMovieList)
        val movies: List<MovieDto> = moviesModel.getMovies()
        movieRecycler.adapter = MoviesAdapter(movies, this)
        movieRecycler.layoutManager = GridLayoutManager(this, 2)

        setItemDecoration()
        setSwipeRefresh(movieRecycler.adapter as MoviesAdapter)
    }

    private fun setItemDecoration() {
        val itemDecoration = MovieItemDecoration(20, 0,20, 50)
        movieRecycler.addItemDecoration(itemDecoration)
    }

    private fun setSwipeRefresh(adapter: MoviesAdapter) {
        val pullToRefresh: SwipeRefreshLayout = findViewById(R.id.swipeContainerMovieList)
        pullToRefresh.setOnRefreshListener {
            adapter.updateData(moviesModel.updateMovies())
            pullToRefresh.isRefreshing = false
        }
    }

    private fun setGenreRecycler() {
        val genreRecycler: RecyclerView = findViewById(R.id.rvMovieListGenres)
        genreRecycler.adapter = GenresAdapter(getGenres())
        genreRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun getGenres(): List<String> = this.resources.getStringArray(R.array.genres).toList()

    override fun onItemClick(position: Int) {
        showToast(getToastMessage(position))
    }

    private fun getMovieAt(position: Int): MovieDto? {
        val movies: List<MovieDto> = moviesModel.getMovies()
        return when {
            movies.isEmpty() -> null
            position >= movies.size -> null
            else -> movies[position]
        }
    }

    private fun getToastMessage(position: Int) = getMovieAt(position)?.title?.let {
        getString(R.string.main_click_message, it)
    }

    private fun showToast(message: String?) {
        var text: String? = message
        if (message.isNullOrEmpty()) {
            text = getString(R.string.main_empty_message)
        }

        toast.cancel()
        toast.setText(text)
        toast.show()
    }
}

