package com.kyonggi.tbmbclient.domain.usecase

import com.kyonggi.tbmbclient.data.model.movie.Movie
import com.kyonggi.tbmbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}