package org.insbaixcamp.dado

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgDado = findViewById<ImageView>(R.id.imgDado)
        val btnLanzar = findViewById<Button>(R.id.btnLanzar)

        // Creamos una lista con todas las imágenes de los dados
        val imagenesDado = listOf(
            R.drawable.dado_1,
            R.drawable.dado_2,
            R.drawable.dado_3,
            R.drawable.dado_4,
            R.drawable.dado_5,
            R.drawable.dado_6
        )

        btnLanzar.setOnClickListener {
            // Selecciona una imagen al azar de la lista y la muestra
            imgDado.setImageResource(imagenesDado.random())
        }
    }
}