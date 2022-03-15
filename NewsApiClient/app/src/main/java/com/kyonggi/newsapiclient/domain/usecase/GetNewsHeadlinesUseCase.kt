package com.kyonggi.newsapiclient.domain.usecase

import com.kyonggi.newsapiclient.data.model.APIResponse
import com.kyonggi.newsapiclient.data.util.Resource
import com.kyonggi.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country, page)
    }
}