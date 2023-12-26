package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        var number = intent
        var score = intent.getIntExtra("rand", 0)

        val A: Button = findViewById(R.id.A)
        val B: Button = findViewById(R.id.B)
        val C: Button = findViewById(R.id.C)
        val D: Button = findViewById(R.id.D)

        A.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }
        B.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }
        C.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }
        D.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            score += 1
            intent.putExtra("rand", score)
            startActivity(intent)
        }
    }
}