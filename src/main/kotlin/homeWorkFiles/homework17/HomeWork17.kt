/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles.homework17

//Inheritance homework

fun main() {
    val myTata = Tata("Harrier", "SUV")
    myTata.mChangeCarName("White Version")
    println(myTata.mCarName)

    val mBMW = BMW("7 Series", "Sedan")
    mBMW.mChangeCarName("Black Version")
    println(mBMW.mCarName)
}