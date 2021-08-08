package com.example.myapplication

import java.lang.AssertionError

class MoviesModel(
	private val moviesDataSource: MoviesDataSource
) {
	private var movies: ArrayList<MovieDto> = arrayListOf()

	private fun loadMovies(): ArrayList<MovieDto> {
		movies = moviesDataSource.loadMovies()
		return movies
	}

	fun getMovies(): ArrayList<MovieDto> {
		Thread.sleep(UPDATE_DELAY)
		if (movies.isEmpty()) {
			loadMovies()
		}
		return movies
	}

	fun setMovies(newList: ArrayList<MovieDto>) {
		movies = newList
	}

	fun updateMovies(): ArrayList<MovieDto> {
		Thread.sleep(UPDATE_DELAY)
		val newList = moviesDataSource.updateMovies()
		if (newList.isEmpty()) {
			throw AssertionError("No data loaded")
		}
		movies = newList
		return movies
	}
}

const val UPDATE_DELAY: Long = 1000