package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        var id: String?=intent.getStringExtra("name")
        Toast.makeText(this@Screen3,"Subjects $id",Toast.LENGTH_SHORT).show()
        var braNCH = Courses()
        var classesList = findViewById<ListView>(R.id.classes_lv)
        when (id){
            "cse" ->  classesList.adapter = ArrayAdapter<BranchInfo>(this,android.R.layout.simple_list_item_1,braNCH.class_Cse)
            "ece"->  classesList.adapter = ArrayAdapter<BranchInfo>(this,android.R.layout.simple_list_item_1,braNCH.class_Ece)
            "it"->  classesList.adapter = ArrayAdapter<BranchInfo>(this,android.R.layout.simple_list_item_1,braNCH.class_It)
        }


        var back = findViewById<Button>(R.id.Back)
        back.setOnClickListener { view ->
            val intent = Intent(this,College_Management_App::class.java)
            startActivity(intent)
        }
        classesList.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,Screen4()::class.java)
            intent.putExtra("name",position)
            startActivity(intent)
        }
    }
}