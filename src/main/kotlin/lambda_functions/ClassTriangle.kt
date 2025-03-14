package lambda_functions

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

import kotlin.math.sqrt

class ClassTriangle(
    val a: Double,
    val b: Double,
    val c: Double
) : ClassShape("Triangle") {
    init {
        println("$name created with a = $a, b= $b and c= $c")
        println("$name area is : ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    //function for calculate area of Triangle
    override fun area() =
        sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    //fun calc perimeter
    override fun perimeter() = a + b + c
}