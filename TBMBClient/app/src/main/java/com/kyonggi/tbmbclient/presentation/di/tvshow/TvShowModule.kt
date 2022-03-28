package com.kyonggi.tbmbclient.presentation.di.tvshow

import com.kyonggi.tbmbclient.domain.usecase.GetTvShowsUseCase
import com.kyonggi.tbmbclient.domain.usecase.UpdateTvShowsUseCase
import com.kyonggi.tbmbclient.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase, updateTvShowsUseCase
        )
    }
}