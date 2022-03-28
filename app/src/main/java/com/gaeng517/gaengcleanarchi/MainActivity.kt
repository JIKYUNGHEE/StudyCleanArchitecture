package com.gaeng517.gaengcleanarchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gaeng517.gaengcleanarchi.feature_note.domain.presentation.util.Screen
import com.gaeng517.gaengcleanarchi.ui.theme.GaengCleanArchiAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaengCleanArchiAppTheme {
                androidx.compose.material.Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.NotesScreen.route) {
                        composable(route = Screen.NotesScreen.route) {
                            Screen.NotesScreen(navController = navController)
                        }
                    }
                 }
            }
        }
    }
}