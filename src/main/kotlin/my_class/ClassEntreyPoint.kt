package my_class

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

// here we will learn about class this is class entry point function file

fun main() {
    val myRect = ClassRectangle(4.0, 7.0)

    println("Rectangle are is : ${myRect.calcArea()}")
    println("Rectangle perimeter is : ${myRect.perimeter()}")
    println("Is rectangle is Square? : ${myRect.isSquare()}")

    val myCircle1 = ClassCircle(5.0)
    println()
    val myCrcle2 = ClassCircle(7.0)
}