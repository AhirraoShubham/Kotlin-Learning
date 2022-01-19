/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//WAP to return the product of list using extension function

fun main() {
    val mList = listOf(1, 2, 3, 4, 5, 6)
    println("The product of $mList is ${mList.productOfList()}")
}

//Extension function
fun List<Int>.productOfList(): Int {
    var mProduct = 1
    for (i in this) {
        mProduct *= i
    }
    return mProduct
}