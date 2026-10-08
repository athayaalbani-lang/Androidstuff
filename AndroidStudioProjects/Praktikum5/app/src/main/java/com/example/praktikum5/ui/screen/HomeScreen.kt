package com.example.praktikum5.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onOpenDetail: (Int) -> Unit,
    onOpenProfile: () -> Unit,
    onOpenAbout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Home", style = MaterialTheme.typography.headlineMedium)
        Button(onClick = { onOpenDetail(2033) }) {
            Text("Buka Detail Mahasiswa 2033")
        }
        OutlinedButton(onClick = onOpenProfile) {
            Text("Buka Profile")
        }
        OutlinedButton(onClick = onOpenAbout) {
            Text("Buka About")
        }
    }
}
