package com.example.myapplication.dao

import androidx.room.*
import com.example.myapplication.entities.Movie

@Dao
interface MovieDao {
	@Query("SELECT * FROM movie")
	fun getAll(): List<Movie?>?

	@Query("SELECT * FROM movie WHERE id = :id")
	fun getById(id: Int): Movie?

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(movie: Movie?)

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(movie: Iterable<Movie>)

	@Update
	fun update(movie: Movie?)

	@Delete
	fun delete(movie: Movie?)

	@Query("DELETE FROM movie")
	fun deleteAll()
}