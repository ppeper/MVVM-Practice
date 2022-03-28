package com.kyonggi.tbmbclient.presentation.di.artist

import com.kyonggi.tbmbclient.domain.usecase.GetArtistsUseCase
import com.kyonggi.tbmbclient.domain.usecase.UpdateArtistsUseCase
import com.kyonggi.tbmbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase, updateArtistsUseCase
        )
    }
}