package com.example.rngassesment.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rngassesment.Data.MenuItem
import com.example.rngassesment.Data.menuItems
import com.example.rngassesment.R


@Composable
fun HomeScreen(navController: NavHostController, modifier: Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier.padding(20.dp)
        ) {
            Card(
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                // .background(Color(0xFFE9E7E9)),

            ) {

                Text(
                    text = "Good Morning",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    textAlign = TextAlign.Center
                )

            }

            Box(
                modifier = Modifier.padding(top = 60.dp)
            ) {
                GreetingSection()
            }

        }




        Card(
            shape = RoundedCornerShape(30.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFD016)
            ),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    // Top Text
                    Text(
                        text = "Until 20 June - 30 June",
                        style = TextStyle(color = Color.Black, fontSize = 16.sp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Centered Text
                    Text(
                        text = "30%",
                        style = TextStyle(
                            color = Color(0xFF6225B4), // #6225b4 color
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Discount Text
                    Text(
                        text = "Discount",
                        style = TextStyle(color = Color.Black, fontSize = 16.sp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.logo_banner),
                    contentDescription = "Top Image",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(start = 25.dp)
                )
            }
        }


        GridMenu()
    }
}

// Text("Good Morning", style = MaterialTheme.typography.bodyMedium)

@Composable
fun GreetingSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        // verticalAlignment = Alignment.CenterVertically,

    ) {
        // Profile Picture
        Image(
            painter = painterResource(id = R.drawable.profile), // Replace with your profile image
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp) // First set the size
                .clip(RoundedCornerShape(20.dp)) // Then apply rounded corners
            //.border(2.dp, Color.Gray, RoundedCornerShape(20.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        // Greeting Text
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Sara \nAnderson", // Replace with dynamic name if needed
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            //  Spacer(modifier = Modifier.weight(1f))
            // Icon Buttons
            Row(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fav), // Replace with your heart icon image
                    contentDescription = "Heart Icon",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { /* Handle Heart Click */ }
                        .padding(8.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.profile_btn), // Replace with your profile icon image
                    contentDescription = "Profile Icon",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { /* Handle Profile Click */ }
                        .padding(8.dp)
                )
            }
        }
    }
}


// Grid Menu Composable
@Composable
fun GridMenu() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // 3 columns grid
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(menuItems.size) { index ->
            GridMenuItem(menuItems[index]) // Pass the menu item to GridMenuItem
        }
    }
}

@Composable
fun GridMenuItem(menuItem: MenuItem) {
    Card(
        modifier = Modifier
            .size(100.dp) // Item size
            .clickable { /* Handle click event */ },
        shape = RoundedCornerShape(16.dp), // Rounded corners
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), // Optional: Adds shadow for better look
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                 // Light grey background (Change color as needed)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Icon
            Image(
                painter = painterResource(id = menuItem.iconRes),
                contentDescription = menuItem.title,
                modifier = Modifier
                    .size(40.dp) // Icon size
            )
            Spacer(modifier = Modifier.height(8.dp))
            // Title
            Text(
                text = menuItem.title,
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black
                ),
                maxLines = 1
            )
        }
    }
}