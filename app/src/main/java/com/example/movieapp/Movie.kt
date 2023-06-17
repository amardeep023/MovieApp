package com.example.movieapp

data class Movie(val id: String,
                 val title: String,
                 val year: String,
//                val genre: String,
//                val director: String,
//                val actor: String,
//                val plot: String,
//                val poster: String,
                 val images: List<String>)
//                val rating: String)

fun getMovies(): List<Movie>{
    return listOf(
        Movie(id = "tt35",
        title = "Avatar",
        year = "2022",
        images = listOf("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.etsy.com%2Fin-en%2Flisting%2F1338250645%2Favatar-2-the-way-of-water-png-official&psig=AOvVaw1IxcrJqG6QreQPedVqwvUh&ust=1686975657584000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCNC6gZn4xv8CFQAAAAAdAAAAABAE")
        ),
        Movie(id = "tt41",
        title = "KGF",
        year = "2023",
        images = listOf("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cinematerial.com%2Fmovies%2Fkgf-chapter-1-i7838252&psig=AOvVaw3GFWh8DnkMJrD58KruRPBm&ust=1686975755966000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPjx9sf4xv8CFQAAAAAdAAAAABAE")
        )

    )
}
