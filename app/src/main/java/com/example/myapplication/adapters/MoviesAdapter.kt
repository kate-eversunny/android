package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.entities.Movie

class MoviesAdapter(
	private var listener: OnItemClickListener
	) : RecyclerView.Adapter<MoviesViewHolder>() {

	private var movies: List<Movie> = listOf()

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
		val inflater : LayoutInflater = LayoutInflater.from(parent.context)
		return MoviesViewHolder(inflater.inflate(R.layout.item_movie, parent, false))
	}

	override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
		holder.bind(getItem(position))
		holder.itemView.setOnClickListener {
			listener.onItemClick(getItem(position))
		}
	}

	private fun getItem(position: Int): Movie = movies[position]

	override fun getItemCount(): Int = movies.size

	fun updateData(newList: List<Movie> ) {
		val callback = MoviesCallback(movies , newList)
		val diff = DiffUtil.calculateDiff(callback)
		movies = newList
		diff.dispatchUpdatesTo(this)
	}

	interface OnItemClickListener {
		fun onItemClick(movie: Movie)
	}
}

