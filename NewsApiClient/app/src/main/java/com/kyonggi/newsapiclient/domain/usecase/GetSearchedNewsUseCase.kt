package com.kyonggi.newsapiclient.domain.usecase

import com.kyonggi.newsapiclient.data.model.APIResponse
import com.kyonggi.newsapiclient.data.util.Resource
import com.kyonggi.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}