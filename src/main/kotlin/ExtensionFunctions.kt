/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//here we learn about extension function

//Definition: Kotlin extension function provides a facility to "add" methods to class
// without inheriting a class or using any type of design pattern.
// The created extension functions are used as a regular function inside that class.
//The extension function is declared with a prefix receiver type with method name.

fun main() {
    println("Enter any Number :")
    val mInput = readLine()?.toInt()

    if (mInput != null) {
        if (mInput.isPrime()) {
            println("$mInput is Prime number")
        } else {
            println("$mInput is Not prime number")
        }
    }
}

//extension function
//ex. check prime number
fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}