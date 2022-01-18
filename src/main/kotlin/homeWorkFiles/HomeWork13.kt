/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//find the item from list

fun main() {
    val mList = listOf(3, 2, 5, 1, 5, 6, 7)
    println("The list look like the following : $mList")
    println("Enter a number you want to Search : ")
    val mUserIP = readLine()?.toInt()
    if (mUserIP != null) {
        val mResult = findNumberFromList(mList, mUserIP)
        println("The index of $mUserIP is $mResult")
        //OR
        //println("The index of $mUserIP is ${findNumberFromList(mList, mUserIP)}")
    }
}

//find the number function
fun findNumberFromList(myList: List<Int>, mNum: Int): Int {
    for (item in myList.indices) {
        if (myList[item] == mNum) {
            return item
        }
    }
    return -1
}