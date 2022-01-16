/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//If conditions
fun main() {
    val iNum1 = 11
    val iNum2 = 21
    //another form of if else
    val iNum3 = if (iNum1 + iNum2 == 32) 51 else 101

    if (iNum1 < iNum2) {                            //if this conditions returns true then below line will print
        println("iNum1 is less than iNum2")
    } else if (iNum1 > iNum2) {                     // if above conditions will not give true then this condition will check
        println("iNum1 is greater than iNum2")
    } else {                                      //if both conditions returns false then this block will always execute
        println("iNum1 is equal to iNum2")
    }
    println("Value of iNum3 is : $iNum3")
}