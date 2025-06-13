package com.example.cacthanhphanuicoban2


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun Scr3(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {


        Image(painter = painterResource(R.drawable.remidernotfication), contentDescription = "reminder notification", modifier = Modifier.size(500.dp,400.dp).background(color = Color.Blue))

        Spacer(modifier = Modifier.height(10.dp))

        Text(text="Remider Notification", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text="The advantage of this application is that it provides remiders for yu so you don't forget to keep doing " +
                "your assignments well and accdording to the time you have set.",
            fontSize = 16.sp,modifier = Modifier.padding(horizontal = 16.dp).align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(70.dp))

        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(30.dp).fillMaxWidth()
        ){
            Button(onClick ={navController.navigate(Routes.Screen2)}) {
                Text(text = "<-")
            }

            Button (onClick = {}) {
                Text(text = "Get Started")
            }


        }
    }
}