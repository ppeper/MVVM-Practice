package com.kyonggi.tbmbclient.data.repository.movie.datasource

import com.kyonggi.tbmbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}