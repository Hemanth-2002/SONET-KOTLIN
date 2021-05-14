package com.example.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var layout = findViewById<ConstraintLayout>(R.id.container)
        var spinner = findViewById<Spinner>(R.id.spinner)
        var btn12 = findViewById<Button>(R.id.clr_btn)

        btn12.setOnClickListener(View.OnClickListener {

            var color:String = spinner.selectedItem.toString()

            when(color){
                "red" -> layout.setBackgroundColor(Color.RED)
                "green" -> layout.setBackgroundColor(Color.GREEN)
                "yellow" -> layout.setBackgroundColor(Color.YELLOW)
                "blue" -> layout.setBackgroundColor(Color.BLUE)
            }
        }
        )
    }
}