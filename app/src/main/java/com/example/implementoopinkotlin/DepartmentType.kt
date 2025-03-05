package com.example.implementoopinkotlin

enum class DepartmentType(val maxCredits: Int) {
    COMPUTER_SCIENCE(20),
    MATHEMATICS(20),
    PHYSICS(20),
    ENGINEERING(20);

    
    fun canRegister(currentCredits: Int): Boolean {
        return currentCredits <= maxCredits
    }
}
