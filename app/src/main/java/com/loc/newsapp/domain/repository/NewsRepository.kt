package com.loc.newsapp.domain.repository

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.model.Source
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getNews(source: List<String>): Flow<PagingData<Article>>
}