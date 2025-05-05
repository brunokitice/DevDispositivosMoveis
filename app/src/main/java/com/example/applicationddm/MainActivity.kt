package com.example.applicationddm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applicationddm.components.Tela1
import com.example.applicationddm.components.Tela2
import com.example.applicationddm.ui.theme.ApplicationDDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationDDMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navegacao(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Navegacao(modifier: Modifier) {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "tela1",
        modifier = modifier // <- Aqui agora está usando o modifier corretamente
    ) {
        composable("tela1") {
            Tela1(navController, modifier = Modifier)
        }
        composable("tela2") {
            Tela2(navController, modifier = Modifier)
        }
    }
}
