/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles
//QUE:
//Use this formula for the volume: 0.75 * pi * radius^3
//The volume of the sphere with the radius 5.5 is 392.0118578578125

fun main() {
    val pi = 3.14159265
    val mRadius = 5.5
    val mVol = 0.75 * pi * mRadius * mRadius * mRadius

    println("Use this formula for volume : 0.75 * pi * radius^3")
    println("The volume of the sphere with the radius $mRadius is : $mVol")
}