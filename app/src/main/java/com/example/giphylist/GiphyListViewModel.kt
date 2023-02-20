package com.example.giphylist

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.giphylist.data.giphy.GiphyRepositoryImpl
import com.example.giphylist.data.giphy.RetrofitClient
import com.example.giphylist.data.giphy.api.Data
import kotlinx.coroutines.launch

class GiphyListViewModel: ViewModel() {
    private val retrofit = RetrofitClient.api
    private val giphyRepository = GiphyRepositoryImpl(retrofit)
    private val _giphyData = mutableStateListOf<Data>()
    val giphyData: List<Data> = _giphyData

    fun loadData() {
        viewModelScope.launch {
            giphyRepository.getAllGifs().let {
                _giphyData.addAll(it.body?.body()!!.data)
            }
        }
    }
}
