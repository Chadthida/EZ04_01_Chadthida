package com.example.ez04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class lastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        var number = intent
        var score = intent.getIntExtra("rand", 0)

        val num: TextView = findViewById(R.id.num)

        num.text = "$score"
    }
}