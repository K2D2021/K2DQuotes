package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.screenshot)
            val description = "Some cool man"
            val title = "Some cool man"
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                ImageCard(painter = painter, contentDescription = description, title = title)
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {

                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}
/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}*/

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    /*K2DQuotesTheme {
        Greeting("Android")
    }*/
}


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
/*Row(
    modifier = Modifier
//                    .width(300.dp)
        //.fillMaxSize()
//                    .fillMaxSize(0.1f)
        //.fillMaxHeight(0.9f)
//                    .requiredHeight(1600.dp)
        .background(Color.Yellow),

    //horizontalArrangement = Arrangement.SpaceAround,
    //verticalAlignment = Alignment.CenterVertically
) {

    Row(
        modifier = Modifier
//                    .width(300.dp)
            .fillMaxWidth(0.5f)
//                    .fillMaxSize(0.1f)
            .fillMaxHeight(0.9f)
            .border(10.dp, Color.Black, RoundedCornerShape(10.dp))
            .padding(20.dp)
            .border(10.dp, Color.Black, RoundedCornerShape(10.dp))
            //.height(1600.dp)
            .background(Color.Green)
            .scrollable(
                orientation = Orientation.Vertical,
                state = rememberScrollState()

            ),

                horizontalArrangement = Arrangement . SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "One")
        Text(text = "Two")
        Text(text = "Three", modifier = Modifier
            .offset((-30).dp, (-30).dp)
            .clickable { }
            //.absoluteOffset(30.dp,30.dp)
        )
    }
    /*Row(
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
    }*/
}*/