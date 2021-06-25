package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var q_imgView1 = findViewById<ImageView>(R.id.imv5)
        q_imgView1.setOnClickListener{View ->
            val intent: Intent = Intent(this,Screen3::class.java)
            intent.putExtra("name","cse")
            startActivity(intent)
        }
        var q_imgView2 = findViewById<ImageView>(R.id.imv6)
        q_imgView2.setOnClickListener{View ->
            val intent: Intent = Intent(this,Screen3::class.java)
            intent.putExtra("name","ece")
            startActivity(intent)
        }
        var q_imgView3 = findViewById<ImageView>(R.id.imv7)
        q_imgView3.setOnClickListener{View ->
            val intent: Intent = Intent(this,Screen3::class.java)
            intent.putExtra("name","it")
            startActivity(intent)
        }
    }
}