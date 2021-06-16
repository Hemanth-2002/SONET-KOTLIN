package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Quiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var q_btn = findViewById<Button>(R.id.quiz_btn)
        var q_name = findViewById<EditText>(R.id.quiz_name)

        q_btn.setOnClickListener(View.OnClickListener {

            if(q_name.toString().isEmpty()){
                Toast.makeText(this@Quiz,"Please enter name",Toast.LENGTH_LONG).show()
            }
            else{
                var next:Intent = Intent(this,QuizActivity()::class.java)
                startActivity(next)
            }
        })
    }
}