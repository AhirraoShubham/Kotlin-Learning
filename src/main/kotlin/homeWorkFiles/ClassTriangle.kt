/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

import kotlin.math.sqrt

//Homework 16 class file

class ClassTriangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    init {
        println("Triangle created with a = $a, b= $b, c= $c")
        println("Triangle area is : ${calcArea()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    //fun calc perimeter
    fun perimeter() = a + b + c

    //function for calculate area of Triangle
    fun calcArea(): Double {
        val mPr = perimeter()
        val mRes = ((mPr / 2) * ((mPr / 2) - a) * ((mPr / 2) - b) * ((mPr / 2) - c))
        return sqrt(mRes)
    }
}