package com.example.myapplication

class MoviesModel(
	private val moviesDataSource: MoviesDataSource
) {
	private var movies: ArrayList<MovieDto> = arrayListOf()

	private fun loadMovies(): ArrayList<MovieDto> {
		movies = moviesDataSource.loadMovies()
		return movies
	}

	fun getMovies(): ArrayList<MovieDto> {
		if (movies.isEmpty()) {
			loadMovies()
		}
		return movies
	}

	fun setMovies(newList: ArrayList<MovieDto>) {
		movies = newList
	}

	fun updateMovies(): ArrayList<MovieDto> {
		movies = moviesDataSource.updateMovies()
		return movies
	}
}