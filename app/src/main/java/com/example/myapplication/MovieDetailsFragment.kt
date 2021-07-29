package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation

class MovieDetailsFragment : Fragment() {

	private lateinit var moviePoster: ImageView
	private lateinit var movieGenre: TextView
	private lateinit var movieReleaseDate: TextView
	private lateinit var movieName: TextView
	private lateinit var movieAnnotation: TextView
	private lateinit var movieRating: RatingBar
	private lateinit var movieAgeRestriction: TextView

	companion object {
		fun newInstance(movie: MovieDto): MovieDetailsFragment {
			val args = Bundle()
			val fragment = MovieDetailsFragment()
			args.putParcelable("movie", movie)
			fragment.arguments = args
			return fragment
		}
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		val view: View = inflater.inflate(R.layout.activity_movie_details, container, false)
		initViewAttributes(view)

		val movie = requireArguments().getParcelable<MovieDto>("movie")
		setViewAttributes(movie)

		setActorsRecycler(view, movie as MovieDto)
		return view
	}

	private fun initViewAttributes(view: View) {
		moviePoster = view.findViewById(R.id.ivMovieDetailsPoster)
		movieGenre = view.findViewById(R.id.tvMovieDetailsGenre)
		movieReleaseDate = view.findViewById(R.id.tvMovieDetailsReleaseDate)
		movieName = view.findViewById(R.id.tvMovieDetailsName)
		movieAnnotation = view.findViewById(R.id.tvMovieDetailsAnnotation)
		movieRating = view.findViewById(R.id.rbMovieDetailsRating)
		movieAgeRestriction = view.findViewById(R.id.tvMovieDetailsAgeRestriction)
	}

	private fun setViewAttributes(movie: MovieDto?) {
		moviePoster.load(movie?.imageUrl) {
			transformations(RoundedCornersTransformation(30f))
		}
		movieName.text = movie?.title
		movieAnnotation.text = movie?.fullDescription
		movieAgeRestriction.text = StringBuilder(movie?.ageRestriction.toString() + "+")
		movieGenre.text = movie?.genre
		movieReleaseDate.text = movie?.release
		movieRating.rating = movie?.rateScore!!.toFloat()
	}

	private fun setActorsRecycler(view: View, movie: MovieDto) {
		val actorRecycler: RecyclerView = view.findViewById(R.id.rvActors)
		val actors: Array<ActorDto> = movie.actors
		actorRecycler.adapter = ActorsAdapter(actors)
		actorRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
		val itemDecoration = MovieItemDecoration(10, 0,10, 50)
		actorRecycler.addItemDecoration(itemDecoration)
	}
}