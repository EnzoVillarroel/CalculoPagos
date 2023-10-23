package com.example.calculopagos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculoRegularActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_regular)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val resultado = findViewById<TextView>(R.id.tvResultado)

            val sueldoBruto = findViewById<EditText>(R.id.etSueldoBruto)

            val sueldoBrutoText = sueldoBruto.text.toString()
            val sueldoBrutoToDbl = sueldoBrutoText.toDoubleOrNull() ?:0.0

            val empleado = EmpleadoRegular(sueldoBrutoToDbl)
            val liquido = empleado.calcularLiquido()
            val retencion = sueldoBrutoToDbl - liquido
            resultado.text = "El sueldo liquido es de $liquido\n Las retenciones son de $retencion"

        }
    }

    fun volverAtras(view: View) {
        finish()
    }

}