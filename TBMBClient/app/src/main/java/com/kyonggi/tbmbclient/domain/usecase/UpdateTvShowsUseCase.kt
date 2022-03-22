package com.kyonggi.tbmbclient.domain.usecase

import com.kyonggi.tbmbclient.data.model.tvshow.TvShow
import com.kyonggi.tbmbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}