package com.example.myapplication.repositories

import android.content.Context
import com.example.myapplication.databases.MovieDatabase
import com.example.myapplication.entities.Movie
import com.example.myapplication.model.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.lang.AssertionError

class MovieRepository {

	companion object {

		var movieDatabase: MovieDatabase? = null

		private fun initializeDB(context: Context): MovieDatabase {
			return MovieDatabase.getDatabaseClient(context)
		}

		fun insertData(context: Context, movie: Movie) {
			movieDatabase = initializeDB(context)
			CoroutineScope(IO).launch {
				movieDatabase?.movieDao()?.insert(movie)
			}
		}

		fun loadMovies(context: Context): ArrayList<Movie?>? {
			movieDatabase = initializeDB(context)
			Thread.sleep(UPDATE_DELAY)
			val movies = MoviesDataSourceImpl().loadMovies()
			movieDatabase?.movieDao()?.deleteAll()
			movieDatabase?.movieDao()?.insert(movies)
			return movieDatabase?.movieDao()?.getAll() as ArrayList<Movie?>?
		}

		fun getMovies(context: Context): ArrayList<Movie?>? {
			movieDatabase = initializeDB(context)
			Thread.sleep(UPDATE_DELAY)
			return movieDatabase?.movieDao()?.getAll() as ArrayList<Movie?>?
		}

		fun getMovieDetails(context: Context, id: Int): Movie? {
			movieDatabase = initializeDB(context)
			return movieDatabase?.movieDao()?.getById(id)
		}

		fun updateMovies(context: Context): ArrayList<Movie?>? {
			movieDatabase = initializeDB(context)
			Thread.sleep(UPDATE_DELAY)

			movieDatabase?.movieDao()?.deleteAll()
			val movies = MoviesDataSourceImpl().updateMovies()
			movieDatabase?.movieDao()?.insert(movies)

			val newList = movieDatabase?.movieDao()?.getAll()
			if (newList != null && newList.isEmpty()) {
				throw AssertionError("No data loaded")
			}
			return newList as ArrayList<Movie?>?
		}
	}
}

const val UPDATE_DELAY: Long = 1000