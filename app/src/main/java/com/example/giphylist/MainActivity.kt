package com.example.giphylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.giphylist.ui.theme.GiphyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiphyListTheme {
                GiphyListScreen(viewModel = GiphyListViewModel())
            }
        }
    }
}
