package com.kyonggi.tbmbclient.data.repository.movie.datasource

import com.kyonggi.tbmbclient.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}