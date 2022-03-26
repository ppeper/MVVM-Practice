package com.kyonggi.tbmbclient.data.repository.tvshow.datasourceImpl

import com.kyonggi.tbmbclient.data.model.tvshow.TvShow
import com.kyonggi.tbmbclient.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {
    private val tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList.addAll(tvShows)
    }
}