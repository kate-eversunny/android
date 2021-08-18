package com.example.myapplication.databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myapplication.dao.MovieDao
import com.example.myapplication.converters.ActorArrayConverter
import com.example.myapplication.entities.Movie

@Database(entities = [Movie::class], version = 1)
@TypeConverters(ActorArrayConverter::class)
abstract class MovieDatabase : RoomDatabase() {
	abstract fun movieDao(): MovieDao

	companion object {

		@Volatile
		private var INSTANCE: MovieDatabase? = null

		fun getDatabaseClient(context: Context): MovieDatabase {

			if (INSTANCE != null) return INSTANCE as MovieDatabase

			synchronized(this) {

				INSTANCE = Room
					.databaseBuilder(context, MovieDatabase::class.java, "MOVIE_DATABASE")
					.fallbackToDestructiveMigration()
					.build()

				return INSTANCE as MovieDatabase
			}
		}
	}
}