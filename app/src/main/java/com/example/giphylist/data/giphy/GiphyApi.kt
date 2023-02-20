package com.example.giphylist.data.giphy

import com.example.giphylist.data.giphy.api.Giphy
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GiphyApi {
    @Headers("Accept: application/json")
    @GET("/v1/gifs/trending")
    suspend fun getGiphy(@Query("api_key") key: String): Response<Giphy>
}
