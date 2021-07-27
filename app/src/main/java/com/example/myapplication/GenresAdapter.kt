package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GenresAdapter(private val genres: List<String>): RecyclerView.Adapter<GenresAdapter.GenreViewHolder>() {

	class GenreViewHolder(view: View) : RecyclerView.ViewHolder(view){
		val genre: TextView = view.findViewById(R.id.tvItemGenre)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
		val itemView = LayoutInflater.from(parent.context)
				.inflate(R.layout.item_genre, parent, false)
		return GenreViewHolder(itemView)
	}

	override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
		holder.genre.text = genres[position]
	}

	override fun getItemCount(): Int = genres.size
}