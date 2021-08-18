package com.example.myapplication.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.myapplication.entities.Actor

class ActorsCallback (
	private val oldArray: Array<Actor>,
	private val newArray: Array<Actor>
): DiffUtil.Callback() {

	override fun getOldListSize(): Int = oldArray.size

	override fun getNewListSize(): Int = newArray.size

	override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean = oldArray[oldItemPosition].name == newArray[newItemPosition].name

	override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean = oldArray[oldItemPosition] == newArray[newItemPosition]
}