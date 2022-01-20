package my_class

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//Here we will learn about class

class ClassRectangle(
    val a: Double,
    val b: Double
){
    init {
        println("Rectangle created with a = $a and b = $b")
    }

    //fun for calculate the area of rectangle
    fun calcArea() = a * b

    //fun which return the perimeter of rectangle
    fun perimeter() = 2 * a + 2 * b

    //fun which check the rectangle is square or not
    fun isSquare() = a == b
}