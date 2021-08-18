package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.adapters.MoviesAdapter
import com.example.myapplication.helpers.TAG_MOVIE
import com.example.myapplication.model.MovieDto
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), MoviesAdapter.OnItemClickListener {

    private lateinit var navController: NavController
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.navHostFragment)
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
                    navController.popBackStack(R.id.navMovieListFragment, false)
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

    private fun launchProfileFragment() {
        super.onPostResume()
        navController.navigate(R.id.navProfileFragment)
    }

    override fun onItemClick(movie: MovieDto) {
        val bundle = bundleOf(TAG_MOVIE to movie.id)
        navController.navigate(R.id.action_movieList_to_movieDetails, bundle)
    }

    override fun onBackPressed() {
        when (bottomNav.selectedItemId) {
            R.id.home -> {
                super.onBackPressed()
            }
            else -> {
                super.onPostResume()
                bottomNav.selectedItemId = R.id.home
                navController.popBackStack(R.id.navMovieListFragment, false)
            }
        }
    }
}



