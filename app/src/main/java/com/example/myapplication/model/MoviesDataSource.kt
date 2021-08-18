package com.example.myapplication.model

import com.example.myapplication.entities.Movie

interface MoviesDataSource {
	fun loadMovies(): ArrayList<Movie>
	fun updateMovies(): ArrayList<Movie>
}