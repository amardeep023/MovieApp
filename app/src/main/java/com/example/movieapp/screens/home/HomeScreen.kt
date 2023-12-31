package com.example.movieapp.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.Movie
import com.example.movieapp.MovieRow
import com.example.movieapp.getMovies
import com.example.movieapp.navigation.MovieScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Movies", color = Color.White,
                fontWeight = FontWeight.Bold) },modifier = Modifier,
                colors = TopAppBarDefaults.smallTopAppBarColors(Color.Magenta))
        }) {
        MainContent(navController = navController)
    }

}

@Composable
fun MainContent(navController: NavController,
    moviesList: List<Movie> = getMovies()) {
    Column(
        modifier = Modifier
            .padding(12.dp)
            .padding(top = 55.dp)
    ) {
        LazyColumn {
            items(items = moviesList) {
                MovieRow(movie = it){ movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
//                    Log.d("TAG", "MainContent: $movie")
                }

            }
        }
    }
}