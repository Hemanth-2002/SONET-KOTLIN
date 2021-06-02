package com.example.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

fun add(x:Int,y:Int):Int = x+y
fun sub(x:Int,y:Int):Int = x-y
fun mul(x:Int,y:Int):Int = x*y
fun div(x:Int,y:Int):Int = x/y
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var edit1 = findViewById<EditText>(R.id.et1)
        var edit2 = findViewById<EditText>(R.id.et2)
        var spinner3 = findViewById<Spinner>(R.id.operate)
        var btn = findViewById<Button>(R.id.btn3)
        var res3 = findViewById<TextView>(R.id.tv4)
        btn.setOnClickListener(View.OnClickListener {
            var operate: String = spinner3.selectedItem.toString()
            var v1:Int = edit1.text.toString().toInt()
            var v2:Int = edit2.text.toString().toInt()
            var ans:Int
            when(operate) {
                "+" -> {
                    ans = add(v1, v2)
                    res3.setText("Result: $ans")
                }

                "-" -> {
                    ans = sub(v1, v2)
                    res3.setText("Result: $ans")
                }

                "*" -> {
                    ans = mul(v1, v2)
                    res3.setText("Result: $ans")
                }
                "%" -> {
                    ans = div(v1, v2)
                    res3.setText("Result: $ans")
                }
            }
        })
    }
}