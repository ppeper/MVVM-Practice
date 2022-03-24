package com.kyonggi.tbmbclient.data.repository.artist.datasourceImpl

import com.kyonggi.tbmbclient.data.db.ArtistDao
import com.kyonggi.tbmbclient.data.model.artist.Artist
import com.kyonggi.tbmbclient.data.repository.artist.datasource.ArtistLocalDataSource

class ArtistLocalDataSourceImpl(
    private val artistDao: ArtistDao
): ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistDao.getArtists()
    }

    override suspend fun saveMoviesToDB(artists: List<Artist>) {
        artistDao.saveArtist(artists)
    }

    override suspend fun clearAll() {
        artistDao.deleteAllArtists()
    }
}