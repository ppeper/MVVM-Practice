package com.kyonggi.tbmbclient.domain.repository

import com.kyonggi.tbmbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}