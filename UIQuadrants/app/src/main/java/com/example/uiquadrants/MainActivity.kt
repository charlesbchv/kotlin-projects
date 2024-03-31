package com.example.uiquadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uiquadrants.ui.theme.UIQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIQuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        primo_title = stringResource(R.string.text_composable),
                        primo = stringResource(R.string.displays_text_and_follows),
                        secundo_title = stringResource(R.string.image_composable),
                        secundo = stringResource(R.string.creates_a_composable_),
                        tertio_title = "Row composable",
                        tertio = stringResource(R.string.a_layout_composable),
                        quadro_title = stringResource(R.string.column_composable),
                        quadro = stringResource(R.string.a_layout_composable_that_places)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(primo_title: String, primo: String, secundo_title:String, secundo: String, tertio_title: String, tertio: String, quadro_title: String, quadro: String, modifier: Modifier = Modifier) {
    Box(
        //contentAlignment = Alignment.TopStart,
        modifier = modifier.fillMaxSize()
    ){
        Box(
            modifier = modifier
                .height(420.dp)
                .width(210.dp)
                .align(Alignment.TopStart)
                .background(Color(0xFFEADDFF))
                .padding(top = 16.dp, bottom = 16.dp)
        ) {
            Column (
                modifier = modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            ){
                Text(
                    text = primo_title,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = primo,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(end=10.dp)

                )
            }
        }
        Box(modifier = modifier
            .height(420.dp)
            .width(210.dp)
            .align(Alignment.TopEnd)
            .background(Color(0xFFD0BCFF))
            .padding(top = 16.dp, bottom = 16.dp)
        ) {
            Column(
                modifier = modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            ) {
                Text(
                    text = secundo_title,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = secundo,
                    textAlign = TextAlign.Justify,
                    modifier = modifier

                )
            }
        }
        Box(modifier = modifier
            .height(425.dp)
            .width(210.dp)
            .align(Alignment.BottomStart)
            .background(Color(0xFFB69DF8))
            .padding(top = 16.dp, bottom = 16.dp)
        ) {
            Column(
                modifier = modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            ) {
                Text(
                    text = tertio_title,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = tertio,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(end=10.dp)
                )
            }
        }
        Box(
            modifier = modifier
                .height(425.dp)
                .width(210.dp)
                .align(Alignment.BottomEnd)
                .background(Color(0xFFF6EDFF))
                .padding(top = 16.dp, bottom = 16.dp)
        ) {
            Column(
                modifier = modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            ){
                Text(
                    text = quadro_title,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom=16.dp)
                )
                Text(
                    text = quadro,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UIQuadrantsTheme {
    }
}