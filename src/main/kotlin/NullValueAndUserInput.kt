/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//We will learn Null Value and UserInput

fun main() {
    val userInput = readLine()
    println("You entered : $userInput")

    //println("In Caps : ${userInput?.toUpperCase()}") // ? operator is for check null

    if (userInput != null) {
        println(userInput.toInt() - 11)
    } else {
        println("You entered : $userInput")
    }

}