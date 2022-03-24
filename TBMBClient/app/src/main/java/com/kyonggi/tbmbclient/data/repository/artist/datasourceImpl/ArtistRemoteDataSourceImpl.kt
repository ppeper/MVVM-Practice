package com.kyonggi.tbmbclient.data.repository.artist.datasourceImpl

import com.kyonggi.tbmbclient.data.api.TMDBService
import com.kyonggi.tbmbclient.data.model.artist.ArtistList
import com.kyonggi.tbmbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtists(apiKey)
    }
}