/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package constructor_fun_overloading

//Here we will learn about constructor and function overloading

fun main() {
    val mRect = ClassRectangle(5.0)
    val mCircle = ClassCircle(3.0)
    val mTriangle = ClassTriangle(7.0, 7.0, 7.0)

    val maxAreaRectAndCircle = maxArea(mRect, mCircle)
    val maxAreaRectCircleAndTriangle = maxArea(mRect, mCircle, mTriangle)

    //print
    println("The maximum area of the rectangle and the circle is : $maxAreaRectAndCircle")
    println("The maximum area of the rectangle, the circle and the triangle is : $maxAreaRectCircleAndTriangle")
}

//FUNCTION OVERLOADING

//function which find the max Area
fun maxArea(shape1: ClassShape, shape2: ClassShape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

//function which find the max Area
fun maxArea(shape1: ClassShape, shape2: ClassShape, shape3: ClassShape): Double {
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
    //or a much shorter way to write that function would be:
    //return maxArea(maxArea(shape1, shape2), shape3)
}
