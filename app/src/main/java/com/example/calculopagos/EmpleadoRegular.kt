package com.example.calculopagos

class EmpleadoRegular(sueldoBruto: Double) : Empleado(sueldoBruto) {
    companion object {
        private const val RETENCION_PORCENTAJE = 0.20
    }

    override fun calcularLiquido(): Double {
        return sueldoBruto * (1 - RETENCION_PORCENTAJE)
    }
}