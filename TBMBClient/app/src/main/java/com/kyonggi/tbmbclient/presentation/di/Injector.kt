package com.kyonggi.tbmbclient.presentation.di

import com.kyonggi.tbmbclient.presentation.di.artist.ArtistSubComponent
import com.kyonggi.tbmbclient.presentation.di.movie.MovieSubComponent
import com.kyonggi.tbmbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}