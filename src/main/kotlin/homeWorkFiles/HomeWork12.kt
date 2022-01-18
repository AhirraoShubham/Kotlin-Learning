/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//WAP to accept one number from user and calculate the sum of all values using function
//ex. n=5 , 1+2+3+4+5=15


fun main() {
    println("Enter any Number: ")
    val mUserNum = readLine()?.toInt()
    if (mUserNum!=null){
        calculateSum(mUserNum)
    }
}

fun calculateSum(mNum: Int) {
    var mResult = 0
    for (item in 1..mNum) {
        mResult += item
    }
    println("The sum of value from 1 to $mNum : $mResult")
}