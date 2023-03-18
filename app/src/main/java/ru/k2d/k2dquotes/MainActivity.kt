package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import ru.k2d.k2dquotes.ui.theme.K2DQuotesTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            K2DQuotesTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}

