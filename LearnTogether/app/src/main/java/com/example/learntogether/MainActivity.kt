package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        titre = stringResource(R.string.jetpack_compose_tutorial),
                        paraph_1 = stringResource(R.string.jetpack_compose_is_a_modern),
                        paraph_2 = stringResource(R.string.in_this_tutorial_you_build),
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(titre: String, paraph_1: String, paraph_2: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ){
        Text(
            text = titre,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paraph_1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paraph_2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingImage(
            titre = stringResource(R.string.jetpack_compose_tutorial),
            paraph_1 = stringResource(R.string.jetpack_compose_is_a_modern),
            paraph_2 = stringResource(R.string.in_this_tutorial_you_build)
        )
    }
}

@Composable
fun GreetingImage(titre: String, paraph_1: String, paraph_2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box(modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Column(
            modifier = Modifier
                .matchParentSize(), // Le Column doit également remplir le Box pour bien centrer le texte
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GreetingText(
                titre = titre,
                paraph_1 = paraph_1,
                paraph_2 = paraph_2,
            )
        }
    }
}

fun Column(modifier: Modifier, verticalArrangement: Arrangement.HorizontalOrVertical, horizontalAlignment: Alignment.Horizontal) {

}
