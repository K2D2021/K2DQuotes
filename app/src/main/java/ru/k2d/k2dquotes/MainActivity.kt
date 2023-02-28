package ru.k2d.k2dquotes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.properties.Delegates
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    var switcher by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        switcher = 0

        setContent {
            Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }
                ColorBox(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(color.value),
                    switcher
                )
                {
                    color.value = it
                    changeSwitcher()
                }
                Box(
                    modifier = Modifier
                        .background(color.value)
                        .weight(1f)
                        .fillMaxSize()
                )
            }
        }
    }

    private fun changeSwitcher() {
        switcher = if (switcher == 0) 1 else 0
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ColorBox(modifier: Modifier = Modifier, switcher: Int, updateColor: (Color) -> Unit) {

    var mod = modifier
    if (switcher == 1) {
        mod = modifier.background(
            Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        )
    }

    Box(modifier = mod
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
    {
        Text(text = switcher.toString())
    }
}


