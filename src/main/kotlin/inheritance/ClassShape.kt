package inheritance

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

open class ClassShape(
    var name: String
) {
    init {
        println("I am the super class!")
    }

    fun mChangeName(newName: String) {
        name = newName
    }
}