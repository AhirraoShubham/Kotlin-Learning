/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//We will learn While loop here

fun main() {
//    //Demo 1
//    var mNum = 11
//    //while loop
//    while (mNum > 0) {
//        println("Hello $mNum")
//        mNum--
//    }

    //Demo 2
    val mArr = arrayOf("Hello", "guy's", "whats up?")   //Array
    val mArrSize = mArr.size        //size of an array
    var iCount = 0          //counter variable
    //loops
    while (iCount < mArrSize) {
        println(mArr[iCount])
        iCount++
    }
}