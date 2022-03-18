package com.kyonggi.newsapiclient.presentation.di

import com.kyonggi.newsapiclient.data.db.ArticleDAO
import com.kyonggi.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.kyonggi.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideNewsLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }
}