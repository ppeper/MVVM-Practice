package com.kyonggi.tbmbclient.domain.repository

import com.kyonggi.tbmbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtist(): List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}