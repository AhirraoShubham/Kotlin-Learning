/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//here we will learn arithmetic operators of kotlin language

fun main() {
    println("------------------------Arithmetic Operators-------------------------------")
    //Addition
    // Operator "+"
    val xAdd = 11
    val yAdd = 21
    val mAddResult = xAdd+yAdd
    println("Addition Result is : $mAddResult")
        //OR
    println(11+21)
        //OR
    println("Addition with{} Result is : ${xAdd+yAdd}")  //Using {} brackets we can also do the same
    println("-------------------------------------------------------")

    //Subtraction
    // Operator "-"
    val xSub = 11
    val ySub = 21
    val mSubResult = ySub-xSub
    println("Subtraction Result is : $mSubResult")
    println("-------------------------------------------------------")

    //Multiplication
    // Operator "*"
    val xMulti = 11
    val yMulti = 21
    val mMultiResult = xMulti+yMulti
    println("Multiplication Result is : $mMultiResult")
    println("-------------------------------------------------------")

    //Division
    // Operator "/"
    val xDiv = 101
    val yDiv = 21
    val mDivResult = xDiv/yDiv
    println("Division Result is : $mDivResult")
    println("-------------------------------------------------------")

    //Addition Assignment Operator
    // Operator "+="
    var xAAO = 101
    val yAAO = 21
    var mAAOResult = xAAO+yAAO
    println("Result is : $mAAOResult")
    xAAO += 20  //Its same like xAAO = xAAO+20
    mAAOResult = xAAO+yAAO
    println("Addition Assignment Operator Result is : $mAAOResult")
    println("-------------------------------------------------------")

    //Subtraction Assignment Operator
    // Operator "-="
    var xSAO = 101
    val ySAO = 21
    var mSAOResult = xSAO+ySAO
    println("Result is : $mSAOResult")
    xSAO -= 15  //Its same like xSAO = xSAO-15
    mSAOResult = xSAO+ySAO
    println("Subtraction Assignment Operator Result is : $mSAOResult")
    println("-------------------------------------------------------")
}