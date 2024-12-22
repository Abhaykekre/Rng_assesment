package com.example.rngassesment.Data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import com.example.rngassesment.R

// Data class for menu items
data class MenuItem(
 val id: Int,
 val title: String,
 val iconRes: Int
)

val menuItems = listOf(
 MenuItem(1, "Inbox", R.drawable.ic_1), // Replace with your drawable
 MenuItem(2, "Maps", R.drawable.ic_2), // Replace with your drawable
 MenuItem(3, "Chat", R.drawable.ic_3), // Replace with your drawable
 MenuItem(4, "Report", R.drawable.ic_4), // Replace with your drawable
 MenuItem(5, "Calendar", R.drawable.ic_5), // Replace with your drawable
 MenuItem(6, "Tips", R.drawable.ic_6), // Replace with your drawable
 MenuItem(7, "Settings", R.drawable.ic_7), // Replace with your drawable
 MenuItem(8, "Share", R.drawable.ic_8), // Replace with your drawable
 MenuItem(9, "More", R.drawable.ic_9) // Replace with your drawable
)
