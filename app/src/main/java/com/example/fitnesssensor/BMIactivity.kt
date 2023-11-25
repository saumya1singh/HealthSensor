package com.example.fitnesssensor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BMIactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val height= findViewById<EditText>(R.id.eTHeight)
        val weight= findViewById<EditText>(R.id.eTWeight)
        val btnCalc= findViewById<Button>(R.id.btnBMI)
        val resultText= findViewById<TextView>(R.id.tVResult)

        btnCalc.setOnClickListener {
            val h= (height.text.toString()).toFloat()/100
            val w= (weight.text.toString()).toFloat()

            val r= w/(h*h)
            resultText.text= "Your BMI is $r"
        }


    }
}