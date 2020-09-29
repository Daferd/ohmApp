package com.daferarevalo.ohmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcularButton.setOnClickListener {
            var banda1Aux = banda1Spinner.selectedItem.toString()

            when (banda1Aux){
                "rojo" -> banda1Button.setBackgroundColor(10)
                "negro"-> banda2Button.setBackgroundColor(11)
                else -> toleranciaButton.setBackgroundColor(15)
            }

        }
    }
}