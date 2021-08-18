package com.example.myapplication.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.myapplication.converters.ActorArrayConverter

@Entity
data class Movie(

	@PrimaryKey(autoGenerate = true)
	val id: Int,

	@ColumnInfo(name = "image_url")
	val imageUrl: String?,

	val title: String?,

	val description: String?,

	@ColumnInfo(name = "full_description")
	val fullDescription: String?,

	@ColumnInfo(name = "rate_score")
	val rateScore: Int,

	@ColumnInfo(name = "age_restriction")
	val ageRestriction: Int,

	val genre: String?,

	val release: String?,

	@TypeConverters(ActorArrayConverter::class)
	val actors: Array<Actor>

) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as Movie

		if (id != other.id) return false
		if (imageUrl != other.imageUrl) return false
		if (title != other.title) return false
		if (description != other.description) return false
		if (fullDescription != other.fullDescription) return false
		if (rateScore != other.rateScore) return false
		if (ageRestriction != other.ageRestriction) return false
		if (genre != other.genre) return false
		if (release != other.release) return false
		if (!actors.contentEquals(other.actors)) return false

		return true
	}

	override fun hashCode(): Int {
		var result = id
		result = 31 * result + (imageUrl?.hashCode() ?: 0)
		result = 31 * result + (title?.hashCode() ?: 0)
		result = 31 * result + (description?.hashCode() ?: 0)
		result = 31 * result + (fullDescription?.hashCode() ?: 0)
		result = 31 * result + rateScore
		result = 31 * result + ageRestriction
		result = 31 * result + (genre?.hashCode() ?: 0)
		result = 31 * result + (release?.hashCode() ?: 0)
		result = 31 * result + actors.contentHashCode()
		return result
	}
}