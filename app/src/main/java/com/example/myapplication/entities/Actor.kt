package com.example.myapplication.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Actor(

	@PrimaryKey(autoGenerate = true)
	val id: Int,

	val name: String?,

	@ColumnInfo(name = "image_url")
	val imageUrl: String?,
)