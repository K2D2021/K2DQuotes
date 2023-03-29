package ru.k2d.k2dquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                CategoryList()
            }
        }
    }
}

@Composable
fun CategoryList() {
    val categories = remember { mutableStateListOf<String>() }

    LaunchedEffect(Unit) {
        val url = "https://example.com/api/categories"
        val response = withContext(Dispatchers.IO) {
            URL(url).readText()
        }
        val json = JSONObject(response)
        val jsonArray = json.getJSONArray("results")
        for (i in 0 until jsonArray.length()) {
            val category = jsonArray.getJSONObject(i).getString("category")
            categories.add(category)
        }
    }

    val noDuplicates = categories.toHashSet().toMutableList().sorted()

    Column {
        Text("Categories:")
        LazyColumn {
            items(noDuplicates) { category ->
                Text(category)
            }
        }
    }
}