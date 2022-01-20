package my_class

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

class ClassCircle(
    val mRadius: Double
) {
    //Variables
    val pi = 3.141592

    init {
        println("Circle created with radius = $mRadius")
        println("Circle area is : ${circleArea()}")
        println("Circle perimeter is :${perimeter()}")
    }

    //fun area
    fun circleArea() = mRadius * mRadius * pi

    //perimeter
    fun perimeter() = 2 * mRadius * pi
}