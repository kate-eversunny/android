package com.example.myapplication.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.dao.ProfileDao
import com.example.myapplication.entities.Profile

@Database(entities = [Profile::class], version = 1)
abstract class ProfileDatabase : RoomDatabase() {
	abstract fun profileDao() : ProfileDao
}