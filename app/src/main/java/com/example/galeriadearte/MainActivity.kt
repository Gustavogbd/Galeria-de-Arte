package com.example.galeriadearte

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galeriadearte.ui.theme.GaleriaDeArteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeArteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtGallery()
                }
            }
        }
    }
}

@Composable
fun ArtGallery(){
    Column(modifier = Modifier.fillMaxSize()) {
        ImageGallery()
        ImageDescription()
        ArtButtons()
    }
}
@Composable
fun ImageGallery(){
    Row(
        modifier = Modifier
            .size(600.dp)
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "Art"
        )
    }
}

@Composable
fun ImageDescription(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            text = "Título",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text(text = "Nome (Ano)")
    }
}

@Composable
fun ArtButtons(){
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 150.dp, height = 50.dp)
        ) {
            Text(text = "Anterior")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 150.dp, height = 50.dp)
        ) {
            Text(text = "Próximo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtGallery()
}