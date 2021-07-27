package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

data class MovieDto(
	val imageUrl: String?,
	val title: String?,
	val description: String?,
	val rateScore: Int,
	val ageRestriction: Int,
): Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readInt(),
		parcel.readInt()
	)

	override fun describeContents(): Int {
		return 0
	}

	override fun writeToParcel(dest: Parcel?, flags: Int) {
		dest?.writeString(imageUrl)
		dest?.writeString(title)
		dest?.writeString(description)
		dest?.writeInt(rateScore)
		dest?.writeInt(ageRestriction)
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