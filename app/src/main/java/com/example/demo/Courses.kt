package com.example.demo

class Courses {
    var class_Cse = ArrayList<BranchInfo>()
    var class_Ece = ArrayList<BranchInfo>()
    var class_It = ArrayList<BranchInfo>()
    init{
        initcse()
        initece()
        initit()
    }
    private fun initcse(){
        var cseClass = BranchInfo("CSE","Subject1")
        class_Cse.add(cseClass)
        cseClass = BranchInfo("CSE","Subject2")
        class_Cse.add(cseClass)
        cseClass = BranchInfo("CSE","Subject3")
        class_Cse.add(cseClass)
    }
    private fun initece(){
        var eceClass = BranchInfo("ECE","Subject1")
        class_Ece.add(eceClass)
        eceClass = BranchInfo("ECE","Subject2")
        class_Ece.add(eceClass)
        eceClass = BranchInfo("ECE","Subject3")
        class_Ece.add(eceClass)
    }
    private fun initit(){
        var itClass = BranchInfo("IT","Subject1")
        class_It.add(itClass)
        itClass = BranchInfo("IT","Subject2")
        class_It.add(itClass)
        itClass = BranchInfo("IT","Subject3")
        class_It.add(itClass)
    }
}