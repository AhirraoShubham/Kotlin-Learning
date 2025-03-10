/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//find the alternating sum of list item

fun main() {
    val mSum = alternateSum(3, 4, 5, 2, 1, 2, 3)
    println("Alternate Sum of list is : $mSum")
}

fun alternateSum(vararg mNumbers: Int): Int {
    var mResult = 0
    var mToggle = true
    for (item in mNumbers) {
        if (mToggle) {
            mResult += item
        } else {
            mResult -= item
        }
        mToggle = !mToggle
    }
    return mResult
}