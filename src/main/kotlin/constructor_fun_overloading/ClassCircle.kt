package constructor_fun_overloading

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
    //Visibility modifier
    //private
    private val pi = 3.141592

    init {
        println("$name created with radius = $mRadius")
        println("$name area is : ${area()}")
        println("$name perimeter is :${perimeter()}")
    }

    //fun area
    override fun area() = mRadius * mRadius * pi

    //perimeter
    override fun perimeter() = 2 * mRadius * pi
}