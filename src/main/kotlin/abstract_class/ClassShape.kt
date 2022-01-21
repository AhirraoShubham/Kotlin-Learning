package abstract_class

/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

abstract class ClassShape(
    var name: String
) {
    init {
        println("I am the super class!")
    }

    //abstract function
    abstract fun area(): Double

    //another abstract function
    abstract fun perimeter(): Double

    fun mChangeName(newName: String) {
        name = newName
    }
}