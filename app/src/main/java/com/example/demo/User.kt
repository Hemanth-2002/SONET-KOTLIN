package com.example.demo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var firstName:String,
    var lastName:String,
    var age:Int
    )