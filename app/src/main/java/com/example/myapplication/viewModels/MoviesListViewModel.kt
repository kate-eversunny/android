package com.example.myapplication.viewModels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.entities.Movie
import com.example.myapplication.model.MovieListLiveData
import com.example.myapplication.repositories.MovieRepository
import kotlinx.coroutines.*

class MoviesListViewModel : ViewModel() {
	private val data: MutableLiveData<ArrayList<Movie>> = MovieListLiveData()

	fun getData(): MutableLiveData<ArrayList<Movie>> {
		return data
	}

	fun getMovies(): ArrayList<Movie>? {
		return data.value
	}

	fun uploadMovies(context: Context) {
		viewModelScope.launch(Dispatchers.Default) {
			data.postValue(MovieRepository.loadMovies(context) as ArrayList<Movie>)
		}
	}

	fun updateMovies(context: Context) {
		viewModelScope.launch(Dispatchers.Default) {
				data.postValue(MovieRepository.updateMovies(context) as ArrayList<Movie>)
		}
	}

}