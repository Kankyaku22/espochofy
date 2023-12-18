package com.example.estapochofy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estapochofy.ui.theme.EstapochofyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstapochofyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NowPlaying()
                }
            }
        }
    }
}

@Composable
fun NowPlaying() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Now Playing",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 30.sp
                )
        Text(
            text = "Lady Fantasy",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 20.sp
        )

        Image(
            painter = painterResource(id = R.drawable.camel),
            contentDescription = "cammellazo",
            modifier = Modifier.size(350.dp),
            contentScale = ContentScale.FillBounds
        )

        Spacer(modifier = Modifier.height(16.dp))



        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "From",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 15.sp
        )
        Text(
            text = "Camel",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 20.sp
        )
        Text(
            text = "Mirage",
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Slider(value = 0f, onValueChange ={} , modifier = Modifier.fillMaxWidth())

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "00:00",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 14.sp
            )

            Text(
                text = "12:44",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 14.sp,

            )
        }

            Spacer(modifier = Modifier.height(10.dp))

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding()) {
    
                 }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding()) {

                }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding()
                    .size(70.dp)) {
            }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding()) {

                }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding()) {

                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EstapochofyTheme {
        NowPlaying()
    }
}