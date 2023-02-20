package com.example.giphylist

import com.example.giphylist.data.giphy.GiphyApi
import com.example.giphylist.data.giphy.RetrofitClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class GiphyApiTest {
    private lateinit var giphyApi: GiphyApi

    @Before
    fun setUp() {
        giphyApi = RetrofitClient.api
    }

    @Test
    fun testGetGiphyApi() = runBlocking {
        val giphy = giphyApi.getGiphy(BuildConfig.GIPHY_KEY)

        // We get a valid response
        assertEquals(200, giphy.code())

        // Assert the title is not null
        assertNotNull(giphy.body()?.data?.get(0)?.title)
    }
}