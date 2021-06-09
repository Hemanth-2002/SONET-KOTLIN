package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {
    var gamestate = arrayOf(0,0,0,0,0,0,0,0,0)
    var activeplayer = 1
    var gameactive = true
    var winningpos = arrayOf(arrayOf(0,1,2),arrayOf(3,4,5),arrayOf(6,7,8),arrayOf(0,3,6),arrayOf(1,4,7),arrayOf(2,5,8),arrayOf(0,4,8),arrayOf(2,4,6))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }
    fun coinAppear(view:View){
        val img: ImageView = view as ImageView
        val tag:Int = img.tag.toString().toInt()
        Log.i("Tag"," is :$tag")
        if(gamestate[tag]==0 && gameactive){
            gamestate[tag] = activeplayer
            if(activeplayer==1){
                img.setImageResource(R.drawable.white)
                activeplayer = 2
            }
            else{
                img.setImageResource(R.drawable.black)
                activeplayer = 1
            }
        }
        for(pos in winningpos){
            if(gamestate[pos[0]]!=0 && gamestate[pos[0]]==gamestate[pos[1]] && gamestate[pos[1]]==gamestate[pos[2]]){
                gameactive = false
                if(activeplayer==1){
                    Toast.makeText(this,"Black wins",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"WHITE WINS",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}