package homeWorkFiles.homework21

import lambda_functions.ClassCircle
import lambda_functions.ClassShape
import lambda_functions.ImportantNumbers
import kotlin.random.Random

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//user define exception
class NegativeRadiusException : Exception("The radius can't be negative")

class ClassCircle(
    val mRadius: Double
) : ClassShape("Circle") {

    //Companion object :
    companion object {
        fun randomCircle(): ClassCircle {
            val radius = Random.nextDouble(1.0, 10.0)
            return ClassCircle(radius)
        }
    }

    init {
        if (mRadius < 0) {
            throw NegativeRadiusException()
        }
        println("$name created with radius = $mRadius")
        println("$name area is : ${area()}")
        println("$name perimeter is :${perimeter()}")
    }

    //fun area
    override fun area() = mRadius * mRadius * ImportantNumbers.PI

    //perimeter
    override fun perimeter() = 2 * mRadius * ImportantNumbers.PI
}