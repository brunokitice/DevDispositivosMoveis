package com.example.applicationddm.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationddm.R

@Composable
fun ArremessadorDeDados(modifier: Modifier = Modifier){
    var result by remember {mutableStateOf(1)}
    val imageResource = when(result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> return
    }
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = result.toString()
        )
        Text(
            text = "O dado foi arremessado e caiu no número: $result",
            modifier = Modifier.padding(bottom = 16.dp),
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 15.sp
        )
    )
        Button(onClick = {
        result = (1..6).random()
        }) {
            Text("Arremessar!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ArremessadorDeDadosPreview(){
    ArremessadorDeDados()
}