import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FormatarTelefone() {
    var telefone by rememberSaveable { mutableStateOf("") }
    val numRegex = Regex("[^0-9]")

    TextField(
        value = telefone,
        onValueChange = { input ->
            val numeros = input.replace(numRegex, "")
            telefone = formatarTelefoneComMascara(numeros)
        },
        label = { Text("Digite o telefone") }
    )
}

fun formatarTelefoneComMascara(numeros: String): String {
    return when {
        numeros.length <= 2 -> numeros
        numeros.length <= 6 -> "(${numeros.substring(0, 2)}) ${numeros.substring(2)}"
        numeros.length <= 10 -> "(${numeros.substring(0, 2)}) ${numeros.substring(2, 6)}-${numeros.substring(6)}"
        else -> "(${numeros.substring(0, 2)}) ${numeros.substring(2, 7)}-${numeros.substring(7, 11)}"
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFormatarTelefone() {
    FormatarTelefone()
}
