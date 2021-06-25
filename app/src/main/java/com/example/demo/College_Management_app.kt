package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class College_Management_App : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_college_management_app)
        var q_imgView = findViewById<ImageView>(R.id.imgv1)
        q_imgView.setOnClickListener{View ->
            val intent: Intent = Intent(this,Screen2::class.java)
            startActivity(intent)
        }
    }
}