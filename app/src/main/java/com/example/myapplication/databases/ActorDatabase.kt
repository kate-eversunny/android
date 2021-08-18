package com.example.myapplication.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.dao.ActorDao
import com.example.myapplication.entities.Actor

@Database(entities = [Actor::class], version = 1)
abstract class ActorDatabase : RoomDatabase() {
	abstract fun actorDao() : ActorDao
}