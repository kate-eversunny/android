package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

data class ActorDto(
	val name: String?,
	val imageUrl: String?,
) : Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
	)

	override fun describeContents(): Int {
		return 0
	}

	override fun writeToParcel(dest: Parcel?, flags: Int) {
		dest?.writeString(name)
		dest?.writeString(imageUrl)
	}

	companion object CREATOR : Parcelable.Creator<ActorDto> {
		override fun createFromParcel(parcel: Parcel): ActorDto {
			return ActorDto(parcel)
		}

		override fun newArray(size: Int): Array<ActorDto?> {
			return arrayOfNulls(size)
		}
	}
}