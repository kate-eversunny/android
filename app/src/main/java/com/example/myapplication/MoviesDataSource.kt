package com.example.myapplication

interface MoviesDataSource {
	fun loadMovies(): ArrayList<MovieDto>
	fun updateMovies(): ArrayList<MovieDto>
}