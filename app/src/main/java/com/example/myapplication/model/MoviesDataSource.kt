package com.example.myapplication.model

interface MoviesDataSource {
	fun loadMovies(): ArrayList<MovieDto>
	fun updateMovies(): ArrayList<MovieDto>
}