package com.kyonggi.newsapiclient.domain.usecase

import com.kyonggi.newsapiclient.data.model.Article
import com.kyonggi.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}