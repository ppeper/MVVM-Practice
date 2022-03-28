package com.kyonggi.tbmbclient.presentation.di.movie

import com.kyonggi.tbmbclient.domain.usecase.*
import com.kyonggi.tbmbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase, updateMoviesUseCase
        )
    }
}