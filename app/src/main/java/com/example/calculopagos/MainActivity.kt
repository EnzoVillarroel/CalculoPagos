package com.example.calculopagos

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculopagos.ui.theme.CalculoPagosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaInicio()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicio() {
    val contexto = LocalContext.current as ComponentActivity

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calculo de Pagos",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(modifier = Modifier
            .height(60.dp)
            .width(200.dp), onClick = {
            val intent:Intent = Intent(contexto, CalculoHonorariosActivity::class.java)
            contexto.startActivity(intent)
        }) {
            Text("Empleado Honorarios")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(modifier = Modifier
            .height(60.dp)
            .width(200.dp), onClick = {
            val intent:Intent = Intent(contexto, CalculoRegularActivity::class.java)
            contexto.startActivity(intent)
        }) {
            Text("Empleado Regular")
        }
    }
}