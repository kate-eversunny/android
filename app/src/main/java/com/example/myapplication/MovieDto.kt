package com.example.myapplication

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
): Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readInt(),
		parcel.readInt(),
		parcel.readString(),
		parcel.readString()
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