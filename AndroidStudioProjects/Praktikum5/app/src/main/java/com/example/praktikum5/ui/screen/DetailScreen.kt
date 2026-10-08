package com.example.praktikum5.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(
    studentId: Int,
    onBack: () -> Unit,
    onOpenProfile: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Detail", style = MaterialTheme.typography.headlineMedium)
        Text("Student ID: $studentId")
        Button(onClick = onBack) { Text("Kembali") }
        OutlinedButton(onClick = onOpenProfile) { Text("Buka Profile") }
    }
}
