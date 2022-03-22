package com.kyonggi.tbmbclient.domain.usecase

import com.kyonggi.tbmbclient.data.model.artist.Artist
import com.kyonggi.tbmbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtist()
}