package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class Screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)
        var txt = findViewById<TextView>(R.id.meetlink2)
        txt.setMovementMethod(LinkMovementMethod.getInstance())
    }
}