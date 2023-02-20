package com.example.giphylist.data.giphy

import com.example.giphylist.BuildConfig
import com.example.giphylist.data.giphy.api.Giphy
import retrofit2.HttpException
import java.io.IOException

class GiphyRepositoryImpl(
    private val giphyApi: GiphyApi
): GiphyRepository {
    private val giphyKey = BuildConfig.GIPHY_KEY

    override suspend fun getAllGifs(): GiphyResponse<List<Giphy>> {
        return try {
            GiphyResponse(
                body = giphyApi.getGiphy(giphyKey)
            )
        } catch (e: HttpException) {
            GiphyResponse(
                httpCode = e.code(),
                errorMessage = "Server Error"
            )
        } catch (e: IOException) {
            GiphyResponse(
                errorMessage = "Connection Error"
            )
        }
    }
}