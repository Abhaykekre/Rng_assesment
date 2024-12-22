package com.example.rngassesment.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rngassesment.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController, modifier: Modifier = Modifier) {

    LaunchedEffect(key1 = true) {

        delay(1000) // 3 seconds delay
        navController.navigate("login")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFfd6d32)) // Background color set
    ) {
        // Top image
        Image(
            painter = painterResource(id = R.drawable.top_1),
            contentDescription = "Top Image",
            modifier = Modifier.align(Alignment.TopCenter).padding(start = 25.dp)
        )

        // Bottom image
        Image(
            painter = painterResource(id = R.drawable.bottom_1),
            contentDescription = "Bottom Image",
            modifier = Modifier.align(Alignment.BottomCenter).padding(end = 25.dp)

        )

     // center text
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 250.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "UiLover",
                fontSize = 50.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "A vision for the future with our channel",
                fontSize = 13.sp,
                color = Color.White
            )
        }


    }
}

