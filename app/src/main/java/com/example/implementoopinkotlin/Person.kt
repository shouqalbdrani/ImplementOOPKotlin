package com.example.implementoopinkotlin


open class Person(val name: String, val age: Int) {

    constructor(name: String): this (name,18){

    }


    open fun displayInfo() {
        println("Name: $name, Age: $age")
    }

    interface ScholarshipEligible {
        fun isEligible(): Boolean
    }
}
