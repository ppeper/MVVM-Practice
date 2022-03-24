package com.kyonggi.tbmbclient.data.repository.artist

import com.kyonggi.tbmbclient.data.model.artist.Artist
import com.kyonggi.tbmbclient.domain.repository.ArtistRepository

class ArtistRepositoryImpl(): ArtistRepository {
    override suspend fun getArtist(): List<Artist>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateArtist(): List<Artist>? {
        TODO("Not yet implemented")
    }
}