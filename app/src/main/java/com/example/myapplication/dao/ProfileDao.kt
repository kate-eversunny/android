package com.example.myapplication.dao

import androidx.room.*
import com.example.myapplication.entities.Profile

@Dao
interface ProfileDao {

	@Query("SELECT * FROM profile")
	fun getAll(): List<Profile>

	@Query("SELECT * FROM profile WHERE name = :id")
	fun getById(id: Long): Profile

	@Insert
	fun insert(profile: Profile)

	@Update
	fun update(profile: Profile)

	@Delete
	fun delete(profile: Profile)
}