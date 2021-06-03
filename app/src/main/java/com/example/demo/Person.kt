package com.example.demo

import java.lang.Exception

class Person {
    var name:String? = null
        set(value){
            field = value?.toUpperCase()
        }
    var gender:String? = null

    var age:Int = 0
    get()= field
    set(value) = if(value<18) field = 0 else field = value
}