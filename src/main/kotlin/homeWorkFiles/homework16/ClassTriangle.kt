/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles.homework16

import kotlin.math.sqrt

//Homework 16 class file
class ClassTriangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    init {
        println("Triangle created with a = $a, b= $b and c= $c")
        println("Triangle area is : ${calcArea()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    //function for calculate area of Triangle
    fun calcArea() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    //fun calc perimeter
    fun perimeter() = a + b + c
}