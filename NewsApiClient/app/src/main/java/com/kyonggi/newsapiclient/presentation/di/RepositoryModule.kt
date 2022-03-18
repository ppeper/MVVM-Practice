package com.kyonggi.newsapiclient.presentation.di

import com.kyonggi.newsapiclient.data.repository.NewsRepositoryImpl
import com.kyonggi.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.kyonggi.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.kyonggi.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource)
    }
}