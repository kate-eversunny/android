package com.example.myapplication.converters

import androidx.room.TypeConverter
import com.example.myapplication.entities.Actor
import com.google.gson.Gson

class ActorArrayConverter {

	val gson = Gson()

	@TypeConverter
	fun fromActors(actors: Array<Actor>): String {
		return gson.toJson(actors)
	}

	@TypeConverter
	fun toActors(data: String): Array<Actor> {
		return gson.fromJson(data, Array<Actor>::class.java)
	}
}