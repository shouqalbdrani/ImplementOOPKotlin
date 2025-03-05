package com.example.implementoopinkotlin

open class Student(name: String , age:Int , val studentId: Int ,val grade: String ): Person(name , age), Person.ScholarshipEligible{
   // inherent
    override fun displayInfo(){
        super.displayInfo()
        println("Student ID: $studentId, Grade: $grade")

    }

    override fun isEligible(): Boolean {
        return grade == "A" || grade == "B"
    }

}
