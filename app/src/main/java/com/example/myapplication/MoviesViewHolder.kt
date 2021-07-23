package com.example.myapplication

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation

class MoviesViewHolder(view: View, private val listener: MoviesAdapter.OnItemClickListener) : RecyclerView.ViewHolder(view),
View.OnClickListener{

	private val moviePoster: ImageView = view.findViewById(R.id.ivItemPoster)
	private val movieName: TextView = view.findViewById(R.id.tvItemMovieName)
	private val movieAnnotation: TextView = view.findViewById(R.id.tvItemMovieAnnotation)
	private val movieRating: RatingBar = view.findViewById(R.id.rbItemRating)
	private val movieAgeRestriction: TextView = view.findViewById(R.id.tvItemAgeText)

	init{
		view.setOnClickListener(this)
	}

	override fun onClick(view: View?) {
		val position: Int = this.layoutPosition
		if (position != RecyclerView.NO_POSITION) {
			listener.onItemClick(position)
		}
	}

	fun bind(movie: MovieDto) {
		moviePoster.load(movie.imageUrl) {
			transformations(RoundedCornersTransformation(20f))
			scale(Scale.FILL)
		}
		movieName.text = movie.title
		movieAnnotation.text = movie.description
		movieRating.rating = movie.rateScore.toFloat()
		movieAgeRestriction.text = StringBuilder(movie.ageRestriction.toString() + "+")
	}
}

