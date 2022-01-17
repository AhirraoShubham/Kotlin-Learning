/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//Write a program which accept number from user and check the adult category
//Ex.
// 0-18 = not adult
// 18-60 = adult
// 60+ = very adult

fun main() {
    println("Enter your age : ")
    val mUserAge = readLine()?.toInt()
    if (mUserAge != null) {
        if (mUserAge >= 0 && mUserAge.toInt() < 18) {
            println("You are not Adult")
        } else if (mUserAge.toInt() >= 18 && mUserAge.toInt() <= 60) {          //ADVANCE: mUserAge.toInt() in 19..59
            println("You are Adult")
        } else {
            println("You are really really Old")
        }
    } else {
        println("Invalid age")
    }
}