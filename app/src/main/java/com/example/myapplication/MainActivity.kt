package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        const val MONEDA = "EUR"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
/*
        val fecha = "17/10/26"
        var nombre = "Antoniop Arenas"
        var saldo: Float = 120045.56f
        println("Hola " + nombre)
        nombre = "Fernando"
        println(nombre)
        println(MONEDA)

        //VAMOS APREGUNTAR SI EL CLEINTE ES VIP

 */
        var a = 5 + 5
        println("suma = " + a)
        val e = 12 / 7.0
        println("%.4f".format(e))

        val fecha = "17/10/26"

        // Separar la fecha en partes con substring(inicio, fin)
        // Posiciones:  1  7  /  1  0  /  2  6
        //              0  1  2  3  4  5  6  7
        val dia = fecha.substring(0, 2)    // "17"
        val mes = fecha.substring(3, 5)    // "10"
        val anio = fecha.substring(6, 8)   // "26"

        // Convertir el número del mes en su nombre
        val nombreMes = when (mes) {
            "01" -> "Enero"
            "02" -> "Febrero"
            "03" -> "Marzo"
            "04" -> "Abril"
            "05" -> "Mayo"
            "06" -> "Junio"
            "07" -> "Julio"
            "08" -> "Agosto"
            "09" -> "Septiembre"
            "10" -> "Octubre"
            "11" -> "Noviembre"
            "12" -> "Diciembre"
            else -> "Mes inválido"
        }

        println("Fecha original: $fecha")
        println("Día: $dia")
        println("Mes: $mes")
        println("Año: 20$anio")
        println("Fecha completa: $dia de $nombreMes de 20$anio")
    }

}