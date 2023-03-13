package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import ru.k2d.k2dquotes.ui.HomeScreen
import ru.k2d.k2dquotes.ui.theme.K2DQuotesTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            K2DQuotesTheme {
                HomeScreen()
            }
        }
    }
}

