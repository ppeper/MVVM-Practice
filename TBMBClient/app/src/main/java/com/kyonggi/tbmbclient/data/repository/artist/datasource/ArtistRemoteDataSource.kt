package com.kyonggi.tbmbclient.data.repository.artist.datasource

import com.kyonggi.tbmbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}