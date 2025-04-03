package com.example.applicationddm.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit

@Composable
fun Temporizador(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var instante by remember { mutableStateOf(600L * 1000L) }
        var isrunning by remember { mutableStateOf(true) }
        Text(
            text = formataTempo(instante),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 20.dp)
                .background(Color.Black)
                .padding(8.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 15.sp,
                color = Color.White
            )
        )
        LaunchedEffect(isrunning) {
            while (isrunning && instante > 0) {
                delay(10L)
                instante -= 10L
            }
        }
        Button(onClick = {
            isrunning = false
        }) {
            Text("Pausar Temporizador!")
        }
        Button(onClick = {
            isrunning = true
        }) {
            Text("Retomar Temporizador!")
        }
    }
}

@SuppressLint("DefaultLocale")
fun formataTempo(ftInstante: Long): String {
    val Horas = TimeUnit.MILLISECONDS.toHours(ftInstante) % 24
    val Minutos = TimeUnit.MILLISECONDS.toMinutes(ftInstante) % 60
    val Segundos = TimeUnit.MILLISECONDS.toSeconds(ftInstante) % 60
    val Milissegundos = ftInstante % 1000
    return String.format("%02d:%02d:%02d.%03d", Horas, Minutos, Segundos, Milissegundos)
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewTemporizador() {
    Temporizador()
}