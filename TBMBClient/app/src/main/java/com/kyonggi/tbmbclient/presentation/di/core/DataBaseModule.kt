package com.kyonggi.tbmbclient.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.kyonggi.tbmbclient.data.db.ArtistDao
import com.kyonggi.tbmbclient.data.db.MovieDao
import com.kyonggi.tbmbclient.data.db.TMDBDatabase
import com.kyonggi.tbmbclient.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun providesDataBase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbclient")
            .build()
    }

    @Singleton
    @Provides
    fun providesMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun providesTvDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvDao()
    }

    @Singleton
    @Provides
    fun providesArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }

}