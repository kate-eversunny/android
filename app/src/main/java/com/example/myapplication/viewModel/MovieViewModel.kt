package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.MovieDto
import com.example.myapplication.model.MovieLiveData
import com.example.myapplication.model.MoviesDataSourceImpl
import com.example.myapplication.model.MoviesModel
import kotlinx.coroutines.*

class MovieViewModel : ViewModel() {
	private val data: MutableLiveData<ArrayList<MovieDto>> = MovieLiveData()
	private var moviesModel: MoviesModel = MoviesModel(MoviesDataSourceImpl())

	fun getData(): MutableLiveData<ArrayList<MovieDto>> {
		return data
	}

	fun getMovies(): ArrayList<MovieDto> {
		return data.value!!
	}

	fun setMovies(newList: ArrayList<MovieDto>) {
		moviesModel.setMovies(newList)
		data.postValue(moviesModel.getMovies())
	}

	fun uploadMovies() {
		data.value = moviesModel.getMovies()
	}

	fun updateMovies(): ArrayList<MovieDto> {
		runBlocking {
			launch(Dispatchers.Default) {
				data.postValue(moviesModel.updateMovies())
			}.join()
		}
		return data.value!!
	}

}