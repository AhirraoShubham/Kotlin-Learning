package inheritance

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

class ClassCircle(
    val mRadius: Double
) : ClassShape("Circle") {
    //Variables
    val pi = 3.141592

    init {
        println("$name created with radius = $mRadius")
        println("$name area is : ${circleArea()}")
        println("$name perimeter is :${perimeter()}")
    }

    //fun area
    fun circleArea() = mRadius * mRadius * pi

    //perimeter
    fun perimeter() = 2 * mRadius * pi
}