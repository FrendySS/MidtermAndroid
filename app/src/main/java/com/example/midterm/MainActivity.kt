package com.example.midterm

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen { startActivity(Intent(this, SecondActivity::class.java)) }
        }
    }
}

@Composable
fun MainScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Мои хобби", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.hobby),
            contentDescription = "Хобби",
            modifier = Modifier.size(150.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigate) {
            Text(text = "Подробнее")
        }
    }
}
