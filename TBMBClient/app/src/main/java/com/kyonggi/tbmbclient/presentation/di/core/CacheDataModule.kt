package com.kyonggi.tbmbclient.presentation.di.core

import com.kyonggi.tbmbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.kyonggi.tbmbclient.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.kyonggi.tbmbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.kyonggi.tbmbclient.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.kyonggi.tbmbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kyonggi.tbmbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}