package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), MoviesAdapter.OnItemClickListener {

	private var movieList = MoviesListFragment.newInstance()
	private lateinit var bottomNav: BottomNavigationView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		if (savedInstanceState == null) {
			supportFragmentManager
				.beginTransaction()
				.add(R.id.root_layout, movieList, R.string.tag_movie_list.toString())
				.commit()
		}
		setBottomNavigation()
	}

	private fun setBottomNavigation() {
		bottomNav = findViewById(R.id.mainBottomNavigationView)
		bottomNav.setOnNavigationItemSelectedListener(createBottomNavigationListener())
	}

	private fun createBottomNavigationListener(): BottomNavigationView.OnNavigationItemSelectedListener {
		return BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
			when (menuItem.itemId) {
				R.id.home -> {
					clearBackStack()
					return@OnNavigationItemSelectedListener true
				}
				R.id.profile -> {
					launchProfileFragment()
					return@OnNavigationItemSelectedListener true
				}
			}
			false
		}
	}

	private fun clearBackStack() {
		for (i in 0 until supportFragmentManager.backStackEntryCount) {
			supportFragmentManager.popBackStack()
		}
	}

	private fun launchProfileFragment() {
		val tag = R.string.tag_profile.toString()
		checkBackStack(tag)

		supportFragmentManager
			.beginTransaction()
			.replace(R.id.root_layout, ProfileFragment.newInstance(), tag)
			.addToBackStack(tag)
			.commit()
	}

	private fun checkBackStack(tag: String) {
		if (supportFragmentManager.findFragmentByTag(tag) != null) {
			supportFragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
		}
	}

	override fun onItemClick(movie: MovieDto) {
		val detailsFragment = MovieDetailsFragment.newInstance(movie)
		val tag = R.string.tag_movie_details.toString()

		supportFragmentManager
			.beginTransaction()
			.replace(R.id.root_layout, detailsFragment, tag)
			.addToBackStack(tag)
			.commit()
	}

	override fun onBackPressed() {
		when (bottomNav.selectedItemId) {
			R.id.home -> {
				super.onBackPressed()
			}
			else -> {
				bottomNav.selectedItemId = R.id.home
			}
		}
	}
}

