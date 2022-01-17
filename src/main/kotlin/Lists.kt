/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//hee we will learn about Lists in kotlin

fun main() {
//    val mArr = arrayOf(1, 2, 3) //Note : value of array can be change at run time, but we can not add element in array
//    mArr[0] = 3 //Allowed
//    //mList[0] = 5 //Not Allowed in list but allowed in mutable list
//    val mList = mutableListOf(
//        1,
//        2,
//        3
//    ) //Note : value of list can not be change at run time but if we create a mutable list then we can change the value
//
//    //Operations
//    println(mList)
//    mList.add(4)   //Add element in list
//    println(mList)
//    mList.remove(2) //remove element from list using element
//    println(mList)
//    mList.removeAt(1) //remove element from list using index
//    println(mList)

//    example
    //Get numbers from user
    val mList = mutableListOf<Int>()
    for (i in 1..10) {
        val mInput = readLine()?.toInt()
        if (mInput != null) {
            mList.add(mInput)
        }
    }
    //print data
    println(mList)
}