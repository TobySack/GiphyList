package com.example.giphylist.data.giphy

import com.example.giphylist.data.giphy.api.Giphy

interface GiphyRepository {
    suspend fun getAllGifs(): GiphyResponse<List<Giphy>>
}