import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FormatarTelefone() {
    var telefone by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(""))
    }

    val numRegex = Regex("[^0-9]")

    TextField(
        value = telefone,
        onValueChange = { input ->
            val numeros = input.text.replace(numRegex, "")
            val textoFormatado = formatarTelefoneComMascara(numeros)
            val novoCursor = textoFormatado.length
            telefone = TextFieldValue(
                text = textoFormatado,
                selection = TextRange(novoCursor)
            )
        },
        label = { Text("Digite o telefone") },
        modifier = Modifier.padding(16.dp)
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FormatarTelefone()
    }
}