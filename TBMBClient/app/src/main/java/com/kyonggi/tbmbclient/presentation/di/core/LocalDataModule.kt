package com.kyonggi.tbmbclient.presentation.di.core

import com.kyonggi.tbmbclient.data.db.ArtistDao
import com.kyonggi.tbmbclient.data.db.MovieDao
import com.kyonggi.tbmbclient.data.db.TvShowDao
import com.kyonggi.tbmbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.kyonggi.tbmbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.kyonggi.tbmbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.kyonggi.tbmbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.kyonggi.tbmbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kyonggi.tbmbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}