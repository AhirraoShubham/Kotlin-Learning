import java.lang.NumberFormatException

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//Here we will learn about exceptions
//Exception: It is very important topic in programming.
//All exception classes in Kotlin inherit the Throwable class.
// Every exception has a message, a stack trace, and an optional cause.

fun main() {
    //user define exception call
    val division = try {
        divide(5.0, 0.0)
    } catch (e: DivisionByZeroException) {
        0.0
    }
    println("Result of the division is $division")


    //Inbuilt exception
    println("Enter any Number : ")
    val mInput = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("This is from Finally block")
    }
    println("You entered : $mInput")
}

//We can also create our own exception
class DivisionByZeroException : Exception("You can not divide by zero, Please choose a different number.")

//function
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException()
    }
    return a / b
}