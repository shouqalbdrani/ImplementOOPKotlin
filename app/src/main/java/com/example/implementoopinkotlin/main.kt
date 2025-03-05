package com.example.implementoopinkotlin

fun main(){
    println("Person info:")
    val person = Person("shouq" , 24)
    person.displayInfo()

    println("Student info:")
    val student = Student("Shahad" , 25, 11, "C")
    student.displayInfo()
    println("Is student elgibility ${student.isEligible()}")

    val course1 = Course("Java" , "j1" , 4)
    println(course1.toString()) // to display the course details
    println("hascode of course1:")
    println(course1.hashCode())

    val course2 = Course("Kotlin" , "k1" , 5)
    println(course1.equals(course2))


    val course3 = course1.copy(credits = 4)
    println("after copy course1")
    println(course3.toString())


    val department = DepartmentType.MATHEMATICS
    println("max credits for ${department.name}: ${department.maxCredits}")
    println("can register 30 credit in Mathemtics ${department.canRegister(30)} ")





}