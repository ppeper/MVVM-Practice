package com.kyonggi.tbmbclient.data.repository.tvshow.datasource

import com.kyonggi.tbmbclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(movies: List<TvShow>)
}