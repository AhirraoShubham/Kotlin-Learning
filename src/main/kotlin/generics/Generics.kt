/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package generics

import com.sun.org.apache.xpath.internal.operations.Bool

//here we will learn about generics in kotlin
fun main() {

    var integers = (1..10).toList().customFilter { it > 5 }
    var triple = Triple<Int,String,Boolean>(11, "Mr.Ahirrao", true)
    val customTriple = CustomTriple<Int,String, Boolean>(11,"Mr.Ahirrao",true)
    customTriple.printTypes()
}

//generics function
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}