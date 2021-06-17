package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuizActivity : AppCompatActivity() {

    private var listOfQuestions: ArrayList<Questions>? = null
    var currentPosition = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var Utility = utility()
        listOfQuestions = Utility.getQuestion()

        setQuestion();
    }

    fun setQuestion(){
        var questionObject = listOfQuestions!!.get(currentPosition-1)
        var question = findViewById<TextView>(R.id.q_question)
        question.text= questionObject.question

        var optionOne = findViewById<TextView>(R.id.option_1)
        optionOne.text= questionObject.optOne

        var optionTwo = findViewById<TextView>(R.id.option_2)
        optionTwo.text= questionObject.optTwo

        var optionThree = findViewById<TextView>(R.id.option_3)
        optionThree.text= questionObject.optThree

        var optionFour = findViewById<TextView>(R.id.option_4)
        optionFour.text= questionObject.optFour


    }
}