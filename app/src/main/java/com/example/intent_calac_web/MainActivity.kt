package com.example.intent_calac_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var ButtonCalaculator : Button
        lateinit var ButtonIntent : Button
        lateinit var ButtonWeb : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalaculator=findViewById(R.id.Btn_calc)
        ButtonCalaculator.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)

        ButtonIntent=findViewById(R.id.Btn_intent)
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)

        ButtonWeb=findViewById(R.id.Btn_web)
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
        }
        }
    }
}