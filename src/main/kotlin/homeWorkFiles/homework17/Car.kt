/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles.homework17

open class Car(
    var mCarName: String
) {
    init {
        println("Welcome to the $mCarName Car world!")
    }

    fun mChangeCarName(mName: String) {
        mCarName = mName
    }
}