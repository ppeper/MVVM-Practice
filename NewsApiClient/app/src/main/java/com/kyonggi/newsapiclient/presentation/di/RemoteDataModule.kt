package com.kyonggi.newsapiclient.presentation.di

import com.kyonggi.newsapiclient.data.api.NewsAPIService
import com.kyonggi.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.kyonggi.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun providesNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}