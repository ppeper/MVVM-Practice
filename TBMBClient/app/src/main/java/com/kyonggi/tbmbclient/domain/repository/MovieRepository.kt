package com.kyonggi.tbmbclient.domain.repository

import com.kyonggi.tbmbclient.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}