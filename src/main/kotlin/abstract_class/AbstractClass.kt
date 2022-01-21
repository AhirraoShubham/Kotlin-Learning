/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package abstract_class

import object_and_companion_object.ClassCircle
import object_and_companion_object.ClassRectangle
import object_and_companion_object.ClassTriangle

//Here we will learn about abstract class

fun main() {
    val myCircle1 = ClassCircle(5.0)
    myCircle1.mChangeName("Mr.Ahirrao")
    println("The name of circle is : ${myCircle1.name}\n")

    val myTriangle1 = ClassTriangle(3.0, 3.0, 3.0)
    myTriangle1.mChangeName("Mr.A")
    println("The name of triangle is : ${myTriangle1.name}\n")

    val myRectangle1 = ClassRectangle(2.0, 5.0)
    myTriangle1.mChangeName("Tony")
    println("The name of rectangle is : ${myRectangle1.name}\n")
}