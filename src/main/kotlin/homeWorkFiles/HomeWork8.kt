/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//simple version
//Write a program where you enter a number and count that number to 0

//Hard Version
//Get 2 numbers from user and calculate the first number to the power of second number
//Ex iNum1 to the power of iNum2 is iAns


fun main() {
//    //Simple Version Ans
//    println("Enter any number :")
//    val mUserInput = readLine()?.toInt()
//    var iCnt: Int
//    println("Lets count from $mUserInput to 0")
//    if (mUserInput != null) {
//        iCnt = mUserInput
//        while (iCnt >= 0) {
//            println(iCnt)
//            iCnt--
//        }
//    } else {
//        println("Invalid input")
//    }

    //Hard version ans
    println("Enter first number :")
    val mNum1 = readLine()?.toInt()
    println("Enter second number :")
    val mNum2 = readLine()?.toInt()
    var mAns = 1
    var iCnt = 0

    while (mNum1 != null && mNum2 != null && iCnt < mNum2) {
        mAns *= mNum1
        iCnt++
    }
    println("$mNum1 to the power of $mNum2 is $mAns")
}