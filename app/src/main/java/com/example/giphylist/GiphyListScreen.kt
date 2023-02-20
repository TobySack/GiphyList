package com.example.giphylist

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier

@Composable
fun GiphyListScreen(viewModel: GiphyListViewModel) {
    LaunchedEffect(Unit) {
        viewModel.loadData()
    }

    LazyColumn(modifier = Modifier.fillMaxHeight(), content = {
        items(viewModel.giphyData) { giphy ->
            GiphyItem(data = giphy)
        }
    })
}
