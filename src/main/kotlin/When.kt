/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//Here we learn about when keyword in kotlin
//it simplified if statement


//Note: we can not use && operator here or any another global variable
//because when accept only one variable at a time

fun main() {
    println("Enter your age:")
    val mAge = readLine()?.toInt()
    //when
    when (mAge) {
        in 0..5 -> println("You're a kid!")   //use curly brackets for print multiple lines
        in 6..17 -> println("You're an teenager!")
        18 -> println("Finally, you're 18!")
        19, 20 -> println("you're a young adult.")
        in 21..65 -> println("You're an adult.")
        else -> println(" You're a really old")
    }
}