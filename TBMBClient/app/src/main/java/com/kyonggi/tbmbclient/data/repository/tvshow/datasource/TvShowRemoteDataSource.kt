package com.kyonggi.tbmbclient.data.repository.tvshow.datasource

import com.kyonggi.tbmbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}