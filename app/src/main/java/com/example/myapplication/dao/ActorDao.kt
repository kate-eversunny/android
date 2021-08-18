package com.example.myapplication.dao

import androidx.room.*
import com.example.myapplication.entities.Actor

@Dao
interface ActorDao {

	@Query("SELECT * FROM actor")
	fun getAll(): List<Actor>

	@Query("SELECT * FROM actor WHERE id = :id")
	fun getById(id: Long): Actor

	@Insert
	fun insert(actor: Actor)

	@Update
	fun update(actor: Actor)

	@Delete
	fun delete(actor: Actor)
}