package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.k2d.k2dquotes.ui.theme.K2DQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            K2DQuotesTheme {
               Test()
            }
        }
    }
}

@Composable
fun Test() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Hello")
    }

}