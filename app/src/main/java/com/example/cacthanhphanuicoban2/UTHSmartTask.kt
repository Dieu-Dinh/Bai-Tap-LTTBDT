package com.example.cacthanhphanuicoban2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.delay


@Composable
fun UTHSmartTask () {
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        NavHost(navController = navController, startDestination = Routes.Splash) {
            composable(Routes.Splash) {
                Splash(navController)
            }
            composable(Routes.Screen1) {
                Scr1(navController, modifier = Modifier.padding(padding))
            }
            composable(Routes.Screen2) {
                Scr2(navController, modifier = Modifier.padding(padding))
            }
            composable(Routes.Screen3) {
                Scr3(navController, modifier = Modifier.padding(padding))
            }
        }
    }
}


@Composable
fun Splash(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3000) // 5 seconds delay
        navController.navigate(Routes.Screen1) {
            popUpTo(Routes.Splash) {inclusive = true } // Khoong cho quay lai man hinh splash

        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White) // Background color for the splash screen
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(R.drawable.logouth), contentDescription = "Logo UTH",
                modifier = Modifier
                    .size(400.dp)
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "UTH SmartTasks",
                fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        }
    }
}