package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    QuadrantApp()
}

@Composable
fun QuadrantApp() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1F)) {
            ComposableInfoCard(
                stringResource(R.string.Text_composable),
                stringResource(R.string.description1), Color.Green, Modifier.weight(1F)
            )
            ComposableInfoCard(
                stringResource(R.string.Image_composable),
                stringResource(R.string.description2), Color.Yellow, Modifier.weight(1F)
            )
        }
        Row(Modifier.weight(1F)) {
            ComposableInfoCard(
                stringResource(R.string.Row_composable),
                stringResource(R.string.description3), Color.Cyan, Modifier.weight(1F)
            )
            ComposableInfoCard(
                stringResource(R.string.Column_composable),
                stringResource(R.string.description4), Color.LightGray, Modifier.weight(1F)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) { ComposeQuadrant() }

    }
}