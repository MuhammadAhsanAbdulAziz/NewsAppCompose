package com.loc.newsapp.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
    suspend fun getNews(
        @Query("page") page:Int,
        @Query("source") source:String,
        @Query("apiKey") apiKey:String,
    ):NewsResponse

}