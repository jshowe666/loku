package com.example.loku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loku.feature.feed.ui.FeedScreen
import com.example.loku.ui.theme.LokuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LokuTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LokuApp()
                }
            }
        }
    }
}

@Composable
private fun LokuApp(modifier: Modifier = Modifier) {
    FeedScreen(modifier = modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
private fun LokuPreview() {
    LokuTheme(useDarkTheme = false) {
        Surface(color = MaterialTheme.colorScheme.background) {
            LokuApp()
        }
    }
}
