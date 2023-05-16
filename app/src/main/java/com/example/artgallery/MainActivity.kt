package com.example.artgallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artgallery.ui.theme.ArtGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtGalleryTheme {
                ArtGallery()
            }
        }
    }
}

@Preview
@Composable
fun ArtGallery() {
    ArtGalleryView(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )

}

@Composable
fun ArtGalleryView(modifier: Modifier = Modifier) {
    var artPage by remember { mutableStateOf(1) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        when (artPage) {
            1 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Artwork Title",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Artwork Artist (year)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { artPage = 2 }) {
                        Text(text = "Next")
                    }
                }

            }
            2 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Artwork Title",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Artwork Artist (year)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Button(onClick = { artPage = 1 }) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = { artPage = 3 }) {
                            Text(text = "Next")
                        }
                    }

                }
            }
            3 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.images__1_),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Artwork Title",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Artwork Artist (year)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Button(onClick = { artPage = 2 }) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = { artPage = 4 }) {
                            Text(text = "Next")
                        }
                    }

                }
            }
            4 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.images__2_),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Artwork Title",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Artwork Artist (year)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Button(onClick = { artPage = 3 }) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = { artPage = 5 }) {
                            Text(text = "Next")
                        }
                    }

                }
            }
            5 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.colleenconnerartist),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Artwork Title",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Artwork Artist (year)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Button(onClick = { artPage = 4 }) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = { artPage = 1 }) {
                            Text(text = "Home")
                        }
                    }
                }
            }


        }
    }
}


