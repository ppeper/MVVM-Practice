package com.kyonggi.tbmbclient.data.model.movie

import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("result")
    val movies: List<Movie>
)
