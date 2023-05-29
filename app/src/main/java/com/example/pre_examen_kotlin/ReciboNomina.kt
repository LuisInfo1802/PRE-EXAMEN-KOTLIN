package com.example.pre_examen_kotlin

class ReciboNomina {

    class ReciboNomina(
        var numRecibo: Int,
        var nombre: String,
        var horasTrabajadas: Double,
        var horasExtras: Double,
        var puesto: Int,
        var impuestoPor: Double
    ) {
        fun calcularSubtotal(): Float {
            var resultado = 0.0
            val pagoBase = 200.0
            var pagoPorHoras = 0.0

            when (puesto) {
                1 -> pagoPorHoras = pagoBase + (pagoBase * 0.2)
                2 -> pagoPorHoras = pagoBase + (pagoBase * 0.5)
                3 -> pagoPorHoras = pagoBase + (pagoBase * 1.0)
            }

            resultado = (pagoBase * horasTrabajadas) + (horasExtras * pagoPorHoras * 2)

            return resultado.toFloat()
        }

        fun calcularImpuesto(): Float {
            val resultado = calcularSubtotal() * 0.16
            return resultado.toFloat()
        }

        fun calcularTotalPagar(): Float {
            val pagar = calcularSubtotal() - calcularImpuesto()
            return pagar.toFloat()
        }
    }






}