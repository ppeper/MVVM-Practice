package com.kyonggi.tbmbclient.data.repository.artist.datasource

import com.kyonggi.tbmbclient.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}