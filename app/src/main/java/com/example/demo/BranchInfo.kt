package com.example.demo

class BranchInfo(var courseID:String,var title:String){

    override fun toString(): String {
        return "${courseID} - ${title}"
    }
}