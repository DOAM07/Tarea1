package com.app.entregable1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnsuma= findViewById<Button>(R.id.btnsuma)
        var btnresta= findViewById<Button>(R.id.btnresta)
        var btndivision= findViewById<Button>(R.id.btndivision)
        var btnmultiplicacion= findViewById<Button>(R.id.btnmultiplicacion)

        var numero1 = findViewById<EditText>(R.id.txtnumero1)
        var numero2 = findViewById<EditText>(R.id.txtnumero2)

        var resultado = findViewById<TextView>(R.id.txtresultado)

        btnsuma.setOnClickListener(){

            if (numero1.text.toString().isNotEmpty() && numero2.text.toString().isNotEmpty()){

                var result = numero1.text.toString().toDouble()+ numero2.text.toString().toDouble()
                resultado.text= "$result"
            }else{
                resultado.text = "Falto Ingresar un Numero"
            }
        }

        btnresta.setOnClickListener(){
            if(numero1.text.toString().isNotEmpty() && numero2.text.toString().isNotEmpty()){
                var result = numero1.text.toString().toDouble() - numero2.text.toString().toDouble()
                resultado.text= result.toString()
            }
            else{
                resultado.text="Falto Ingresar un Numero"
            }
        }

        btndivision.setOnClickListener(){
            if(numero1.text.toString().isNotEmpty() && numero2.text.toString().isNotEmpty()){
                var result = numero1.text.toString().toDouble() / numero2.text.toString().toDouble()
                resultado.text="$result"
            }
            else{
                resultado.text="Falto Ingresar un Numero"
            }
        }

        btnmultiplicacion.setOnClickListener(){
            if(numero1.text.toString().isNotEmpty() && numero2.text.toString().isNotEmpty()){
                var result = numero1.text.toString().toDouble() * numero2.text.toString().toDouble()
                resultado.text="$result"
            }
            else{
                resultado.text="Falto Ingresar un Numero"
            }
        }



    }
}