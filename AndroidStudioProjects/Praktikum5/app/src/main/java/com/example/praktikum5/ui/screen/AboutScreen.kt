package com.example.praktikum5.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("About", style = MaterialTheme.typography.headlineMedium)
        Text("NavigationLab — dibuat oleh Athaya Ra'uf Al-Albani (245150200111033)")
        Text("Aplikasi ini dibuat untuk praktikum Navigation Compose, materi NavHost, NavController, route, argument, dan back stack.")
        Button(onClick = onBack) { Text("Kembali") }
    }
}
