package com.kyonggi.tbmbclient.data.repository.artist.datasourceImpl

import com.kyonggi.tbmbclient.data.model.artist.Artist
import com.kyonggi.tbmbclient.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl: ArtistCacheDataSource {
    private val artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList.clear()
        artistList.addAll(artists)
    }
}