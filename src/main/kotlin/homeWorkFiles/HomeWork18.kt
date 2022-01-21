/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles

//WAP to print the array and List in alter net order using function overloading

fun main() {
    //List
    val mList = listOf(1, 2, 3, 4, 5)
    //Array
    val mArray = arrayOf(5, 6, 7, 8, 9)

    //list alter function call
    printAlterList(mList)
    println("----------------------------------------------------------")
    //array alter function call
    printAlterArray(mArray)
}

//function overloading

//list
fun printAlterList(mList: List<Int>) {
    var i = 0
    var j = mList.size - 1
    var toggle = true

    while (i <= j) {
        if (toggle) {
            println(mList[i])
            i++
        } else {
            println(mList[j])
            j--
        }
        toggle = !toggle
    }
}

//array
fun printAlterArray(mArray: Array<Int>) {
    var i = 0
    var j = mArray.size-1
    var mToggle = true
    while (i<=j){
        if (mToggle){
            println(mArray[i])
            i++
        }else{
            println(mArray[j])
            j--
        }
        mToggle = !mToggle
    }
}