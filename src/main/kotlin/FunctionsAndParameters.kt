/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

// here we learn about functions and parameters

fun main() {
    //function call with parameter
    printPow(3, 5)
    //you can call it multiple times
    printPow(5, 5)
    printPow(9, 4)
    printPow(8, 6)
    printPow(2, 7)

    //function call without parameters
    //printThreeLine()
}

//user define function with parameters/argument
fun printPow(base: Int, exponent: Int) {
    var mResult = 1
    for (i in 1..exponent) {
        mResult *= base
    }
    println("$base to the power of $exponent is : $mResult")
}

//user define function without parameter
fun printThreeLine() {
    println("First")
    println("Second")
    println("Third")
}