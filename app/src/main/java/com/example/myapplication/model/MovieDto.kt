package com.example.myapplication.model

import android.os.Parcel
import android.os.Parcelable

data class MovieDto(
	val imageUrl: String?,
	val title: String?,
	val description: String?,
	val fullDescription: String?,
	val rateScore: Int,
	val ageRestriction: Int,
	val genre: String?,
	val release: String?,
	val actors: Array<ActorDto>

): Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readInt(),
		parcel.readInt(),
		parcel.readString(),
		parcel.readString(),
		parcel.readArray(ActorDto.javaClass.classLoader) as Array<ActorDto>
	)

	override fun describeContents(): Int {
		return 0
	}

	override fun writeToParcel(dest: Parcel?, flags: Int) {
		dest?.writeString(imageUrl)
		dest?.writeString(title)
		dest?.writeString(description)
		dest?.writeString(fullDescription)
		dest?.writeInt(rateScore)
		dest?.writeInt(ageRestriction)
		dest?.writeString(genre)
		dest?.writeString(release)
		dest?.writeArray(actors)

	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as MovieDto

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
		var result = imageUrl?.hashCode() ?: 0
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

	companion object CREATOR : Parcelable.Creator<MovieDto> {
		override fun createFromParcel(parcel: Parcel): MovieDto {
			return MovieDto(parcel)
		}

		override fun newArray(size: Int): Array<MovieDto?> {
			return arrayOfNulls(size)
		}
	}
}