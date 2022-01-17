/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles


//Easy HW
//WAP to calculate the sum of array

//fun main() {
//    //Easy
//    val mArr = arrayOf(2, 5, 9, 6, 8, 7, 4, 1, 20)
//    var mSum = 0
//    for (item in mArr) {
//        mSum += item
//    }
//    println("The sum of Array is : $mSum")
//}

//Hard HW
//WAP get numbers from user and find the average

fun main() {
    println("Enter the 5 Numbers")
    var mAns = 0.0
    for (i in 1..5) {
        var num = readLine()?.toInt()
        if (num != null) {
            mAns+=num/5.0
        }
    }
    println("Average of numbers : $mAns")
}