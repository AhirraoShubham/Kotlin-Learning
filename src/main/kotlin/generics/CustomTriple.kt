/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package generics

//generic class
class CustomTriple<A : Any, B : Any, C : Any>(
    var first: A,
    var second: B,
    var third: C
) {
    fun printTypes() {
        println("The type of first is ${first::class} ")
        println("The type of second is ${second::class} ")
        println("The type of third is ${third::class} ")
    }
}