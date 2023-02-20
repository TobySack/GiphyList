package com.example.giphylist.data.giphy

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val api: GiphyApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.giphy.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GiphyApi::class.java)
    }
}
