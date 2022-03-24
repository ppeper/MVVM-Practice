package com.kyonggi.tbmbclient.data.repository.artist.datasource

import com.kyonggi.tbmbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveMoviesToDB(artists: List<Artist>)
    suspend fun clearAll()
}