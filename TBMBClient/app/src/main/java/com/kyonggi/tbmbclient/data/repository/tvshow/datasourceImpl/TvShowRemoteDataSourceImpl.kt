package com.kyonggi.tbmbclient.data.repository.tvshow.datasourceImpl

import com.kyonggi.tbmbclient.data.api.TMDBService
import com.kyonggi.tbmbclient.data.model.tvshow.TvShowList
import com.kyonggi.tbmbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShows(apiKey)
    }
}