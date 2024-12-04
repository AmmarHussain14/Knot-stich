package com.example.knotstich.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.knotstich.ui.screen.LoginScreen
import com.example.knotstich.ui.screen.SignupScreen

@Composable
fun AuthenticationNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(
                onLoginClick = { email, password ->
                    navController.navigate("home")
                },
                onSignUpClick = {
                    navController.navigate("signup")
                }
            )
        }

        composable("signup") {
            SignupScreen(
                onSignupClick = { email, password, confirmPassword ->
                    navController.popBackStack() // Navigate back to login after signup
                },
                onLoginClick = {
                    navController.navigate("login")
                }
            )
        }

        composable("home") {
            Log.i("NavGraph", "Moving to home button")
            //HomeScreen()
        }
    }
}