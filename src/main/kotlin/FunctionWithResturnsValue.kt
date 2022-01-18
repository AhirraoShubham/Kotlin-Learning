/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//here we learn about function with return value
fun main() {
    //function call
    val mPow = calculatePow(3, 8)
    println("3 the power of 8 is : $mPow")

    //single line fun call
    println(calculateMultiply(3,5))
}

//we can also write a single line functions
fun calculateMultiply(mNum1: Int, mNum2: Int) = mNum1 * mNum2

//function with return value
fun calculatePow(base: Int, exponent: Int): Int {
    var mResult = 1
    for (item in 1..exponent) {
        mResult *= item
    }
    return mResult
}