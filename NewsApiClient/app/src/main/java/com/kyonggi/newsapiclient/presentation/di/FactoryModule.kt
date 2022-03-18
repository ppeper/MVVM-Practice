package com.kyonggi.newsapiclient.presentation.di

import android.app.Application
import com.kyonggi.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.kyonggi.newsapiclient.domain.usecase.GetSavedNewsUseCase
import com.kyonggi.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.kyonggi.newsapiclient.domain.usecase.SaveNewsUseCase
import com.kyonggi.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        )
    }
}