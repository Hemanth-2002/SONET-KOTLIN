package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Main4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var input = findViewById<EditText>(R.id.txt)
        var btn = findViewById<Button>(R.id.button)
        var result = findViewById<TextView>(R.id.Result)
        btn.setOnClickListener(View.OnClickListener {
            var x:Int = input.text.toString().toInt()
            var s:String = " "
            var i:Int = 1
            while(true){
                s += "$i@"
                if(i==x){
                    break;
                }
                ++i
            }
            result.setText("Result = $s")
        })
    }
}