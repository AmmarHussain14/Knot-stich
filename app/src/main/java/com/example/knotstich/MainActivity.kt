package com.example.knotstich

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.knotstich.ui.navigation.AuthenticationNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    AuthenticationNavGraph(navController)
                }
            }
        }
    }
}