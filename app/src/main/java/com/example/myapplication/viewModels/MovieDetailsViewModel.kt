package com.example.myapplication.viewModels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.entities.Movie
import com.example.myapplication.model.MovieLiveData
import com.example.myapplication.repositories.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDetailsViewModel : ViewModel() {

	private val data: MutableLiveData<Movie> = MovieLiveData()

	fun getData(): MutableLiveData<Movie> {
		return data
	}

	fun uploadMovie(context: Context, id: Int) {
		viewModelScope.launch(Dispatchers.Default) {
			data.postValue(MovieRepository.getMovieDetails(context, id))
		}
	}

}