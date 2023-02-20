package com.example.giphylist.data.giphy

import com.example.giphylist.data.giphy.api.Giphy
import retrofit2.Response
import java.net.HttpURLConnection

data class GiphyResponse<T>(
    val httpCode: Int = HttpURLConnection.HTTP_OK,
    val body: Response<Giphy>? = null,
    val errorMessage: String? = null
)
