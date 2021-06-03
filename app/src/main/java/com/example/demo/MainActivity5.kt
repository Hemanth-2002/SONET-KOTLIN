package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
fun checkwater(te:Int,di:Int,day:String):Boolean = te>30 || day=="sunday" || di>30
fun rand_day():String{
    var arr = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var d:String = arr[Random().nextInt(arr.size)]
    return d
}
fun food(dy:String):String{
    return when (dy) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "false"
    }
}
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var inp1 = findViewById<EditText>(R.id.temp_5)
        var inp2 = findViewById<EditText>(R.id.dirt_5)
        var btn = findViewById<Button>(R.id.btn5)
        var res1 = findViewById<TextView>(R.id.tv1_5)
        var res2 = findViewById<TextView>(R.id.tv2_5)
        btn.setOnClickListener(View.OnClickListener {
            var temp = inp1.text.toString().toInt()
            var dirt = inp2.text.toString().toInt()
            var day:String = rand_day()
            var food:String = food(day)
            res1.setText("Today is $day, You need to feed $food")
            when(checkwater(temp,dirt,day)){
                true -> res2.setText("Water change: Required")
                false -> res2.setText("Water change: Not required")
            }
        })
    }
}