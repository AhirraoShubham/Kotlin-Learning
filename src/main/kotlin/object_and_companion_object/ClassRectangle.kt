package object_and_companion_object

import kotlin.random.Random

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//Here we will learn about class

class ClassRectangle(
    val a: Double,          //primary constructor
    val b: Double
) : ClassShape("Rectangle") {

    //secondary constructor
    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    //HomeWork 19 continue...
    companion object {
        fun randomRectangle(): ClassRectangle {
            val randomRectA = Random.nextDouble(1.0, 15.0)
            val randomRectB = Random.nextDouble(1.0, 15.0)
            return ClassRectangle(randomRectA, randomRectB)
        }

    }

    init {
        println("$name created with a = $a and b = $b")
        println("$name area is : ${area()}")
        println("$name perimeter is ${perimeter()}")
        println("$name is square?: ${isSquare()}")

    }

    //fun for calculate the area of rectangle
    override fun area() = a * b

    //fun which return the perimeter of rectangle
    override fun perimeter() = 2 * a + 2 * b

    //fun which check the rectangle is square or not
    fun isSquare() = a == b
}