package com.example.myapplication.adapters

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.myapplication.R
import com.example.myapplication.entities.Movie

class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

	private val moviePoster: ImageView = view.findViewById(R.id.ivItemPoster)
	private val movieName: TextView = view.findViewById(R.id.tvItemMovieName)
	private val movieAnnotation: TextView = view.findViewById(R.id.tvItemMovieAnnotation)
	private val movieRating: RatingBar = view.findViewById(R.id.rbItemRating)
	private val movieAgeRestriction: TextView = view.findViewById(R.id.tvItemAgeText)

	fun bind(movie: Movie) {
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

