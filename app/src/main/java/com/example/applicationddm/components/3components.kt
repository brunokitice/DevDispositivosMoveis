package com.example.applicationddm.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextoComEntrada(modifier: Modifier = Modifier) {
    var textoDigitado by remember { mutableStateOf(TextFieldValue("")) }
    var textoFinal by remember { mutableStateOf("Leia isto!") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = textoFinal)
        OutlinedTextField(
            value = textoDigitado,
            onValueChange = { textoDigitado = it },
            label = { Text("Digite algo") },
            modifier = Modifier.padding(top = 16.dp)
        )
        Button(
            onClick = {
                textoFinal = textoDigitado.text
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Ok")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextoComEntradaPreview() {
    TextoComEntrada()
}
