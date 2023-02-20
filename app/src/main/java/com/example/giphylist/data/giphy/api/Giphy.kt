package com.example.giphylist.data.giphy.api

data class Giphy(
    val `data`: List<Data>,
    val meta: Meta,
    val pagination: Pagination
)
