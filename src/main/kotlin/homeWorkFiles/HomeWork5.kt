/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//Logical and Comparison operator homework

//what will be the output of below expressions?

fun main() {
    //One
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    //find it yourself first then try println
    println("Simple Result is : $simpleExpression")

    //Two
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    println("Hard Result is : $hardExpression")
}