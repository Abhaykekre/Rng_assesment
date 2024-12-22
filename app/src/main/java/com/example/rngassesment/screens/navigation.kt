package com.example.rngassesment.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(modifier: Modifier) {
    val navController = rememberNavController() // NavController initialization
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController,modifier) }
        composable("login") { LoginScreen(navController,modifier) }
        composable("home") { HomeScreen(navController,modifier) }
    }
}