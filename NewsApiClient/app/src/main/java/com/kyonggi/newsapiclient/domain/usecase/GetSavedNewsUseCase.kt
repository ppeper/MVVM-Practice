package com.kyonggi.newsapiclient.domain.usecase

import com.kyonggi.newsapiclient.data.model.Article
import com.kyonggi.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }

}