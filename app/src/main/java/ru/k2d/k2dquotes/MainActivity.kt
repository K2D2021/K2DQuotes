package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.k2d.k2dquotes.ui.theme.K2DQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*K2DQuotesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }*/
            //Greeting(name = "K2D")
            Row (
                modifier = Modifier
//                    .width(300.dp)
                    //.fillMaxSize()
//                    .fillMaxSize(0.1f)
                    //.fillMaxHeight(0.9f)
                    .requiredHeight(1600.dp)
                    .background(Color.Yellow),

                //horizontalArrangement = Arrangement.SpaceAround,
                //verticalAlignment = Alignment.CenterVertically
                    ){

                Row(
                    modifier = Modifier
//                    .width(300.dp)
                        .fillMaxWidth(0.5f)
//                    .fillMaxSize(0.1f)
                        //.fillMaxHeight(0.9f)
                        //.height(1600.dp)
                        .background(Color.Green),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "One")
                    Text(text = "Two")
                    Text(text = "Three")
                }
                Row(
                    modifier = Modifier
//                    .width(300.dp)
                        .fillMaxWidth()
                        //.fillMaxWidth(0.5f)
//                    .fillMaxSize(0.1f)
                        .fillMaxHeight(0.9f)
                        .background(Color.Red),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "One")
                    Text(text = "Two")
                    Text(text = "Three")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    K2DQuotesTheme {
        Greeting("Android")
    }
}