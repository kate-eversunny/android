package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.myapplication.model.ActorDto
import com.example.myapplication.R

class ActorsAdapter (private val actors: Array<ActorDto>): RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>() {

		class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view){
			val name: TextView = view.findViewById(R.id.tvItemActorName)
			val actorImage: ImageView = view.findViewById(R.id.ivItemActorPortrait)

		}

		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
			val itemView = LayoutInflater.from(parent.context)
				.inflate(R.layout.item_actor, parent, false)
			return ActorViewHolder(itemView)
		}

		override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
			holder.name.text = actors[position].name
			holder.actorImage.load(actors[position].imageUrl) {
				transformations(RoundedCornersTransformation(20f))
				scale(Scale.FILL)
			}
		}

		override fun getItemCount(): Int = actors.size
}