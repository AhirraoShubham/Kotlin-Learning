/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//Accept country name from user and print the greetings regarding the country

fun main(){
    println("Please enter your country name: ")
    val mCountryName = readLine()

    when(mCountryName){
        "India"-> println("Namaste!")
        "USA" -> println("Hello")
        "Spain" -> println("Hola")
        "Paris" -> println("Bonjour")
        else -> println("I think you're a alien!!!!!")
    }
}
