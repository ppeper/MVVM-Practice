package com.kyonggi.tbmbclient.data.repository.movie.datasource

import com.kyonggi.tbmbclient.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}