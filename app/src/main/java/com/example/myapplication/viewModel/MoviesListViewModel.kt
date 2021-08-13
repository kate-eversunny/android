package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.MovieDto
import com.example.myapplication.model.MovieListLiveData
import com.example.myapplication.model.MoviesModel
import kotlinx.coroutines.*

class MoviesListViewModel : ViewModel() {
	private val data: MutableLiveData<ArrayList<MovieDto>> = MovieListLiveData()
	private var moviesModel: MoviesModel = MoviesModel


	fun getData(): MutableLiveData<ArrayList<MovieDto>> {
		return data
	}

	fun getMovies(): ArrayList<MovieDto>? {
		return data.value
	}

	fun setMovies(newList: ArrayList<MovieDto>) {
		moviesModel.setMovies(newList)
		data.postValue(moviesModel.getMovies())
	}

	fun uploadMovies() {
		data.value = moviesModel.getMovies()
	}

	fun updateMovies() {
		viewModelScope.launch(Dispatchers.Default) {
				data.postValue(moviesModel.updateMovies())
		}
	}

}