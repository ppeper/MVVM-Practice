package com.kyonggi.tbmbclient.data.repository.movie.datasourceImpl

import com.kyonggi.tbmbclient.data.api.TMDBService
import com.kyonggi.tbmbclient.data.model.movie.MovieList
import com.kyonggi.tbmbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}