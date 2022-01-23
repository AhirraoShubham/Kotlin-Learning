/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//Homework for lambda function
//create a function customSum and that fun should apply to list of numbers and
// return the sum of odd number from that list

fun main() {
    val mList = (1..10).toList()
    val mSum = mList.customSum { it % 2 == 1 }
    println("The sum is: $mSum")
}

fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int {
    var mFinalSum = 0
    for (num in this) {
        if (sumFunction(num)) {
            mFinalSum += num
        }
    }
    return mFinalSum
}