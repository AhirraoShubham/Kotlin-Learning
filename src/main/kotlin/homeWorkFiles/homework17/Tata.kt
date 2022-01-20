/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles.homework17

class Tata(
    val carModel:String,
    val carType:String
) : Car("Tata"){
    init {
        println("$mCarName cars are made for average and top people")
        println("$mCarName Car specification: ${mSpecification()}")
        println("$mCarName car has ${mAverage()} Km/Pl average")
    }

    //car specifications
    fun mSpecification() = "$mCarName, $carModel is $carType car"

    fun mAverage() = 21
}