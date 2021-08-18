package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.MovieDto
import com.example.myapplication.model.MovieLiveData
import com.example.myapplication.model.MoviesModel

class MovieDetailsViewModel : ViewModel() {
	private val data: MutableLiveData<MovieDto> = MovieLiveData()
	private var moviesModel: MoviesModel = MoviesModel

	fun getData(): MutableLiveData<MovieDto> {
		return data
	}

	fun uploadMovie(id: Int): MovieDto? {
		data.value = moviesModel.getMovies().find { it.id == id }
		return data.value
	}

}