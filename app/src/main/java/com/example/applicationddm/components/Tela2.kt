package com.example.applicationddm.components
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun Tela2(nC: NavHostController?, modifier: Modifier) {
    Column (modifier = modifier) {
        Text("Essa é a tela 2")
        Button(onClick = {nC?.navigate("tela1")}) {Text("Vá para a tela 1")}
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTela2() {
    Tela1(nC = null , modifier = Modifier)
}