/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles.homework17

class BMW(
    val mCarModel:String,
    val mCarType:String
) :Car("BMW") {
    init {
        println("$mCarName is only made for top class persons")
        println("$mCarName Car specification: ${mSpecification()}")
        println("$mCarName Car has ${mAverage()} Km/Pl average")
    }

    //cr specifications
    fun mSpecification() = "$mCarName, $mCarModel is $mCarType car"

    //car average
    fun mAverage() = 18
}