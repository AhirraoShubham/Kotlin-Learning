/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//Que : Check string is palindrome or not
//Example:
// The string is racecar
// The string is palindrome

fun main() {
    val mString = "racecar"

    println("The String is $mString")
    //if condition
    if (mString.reversed() == mString) {
        println("This string $mString is palindrome")
    } else {
        println("This String is not palindrome")
    }
}