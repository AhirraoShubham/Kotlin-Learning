/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package homeWorkFiles
//List
//easy
//Accept a numbers from user and print it in reverse order
//
//fun main() {
//    println("Enter 5 numbers :")
//    val mList = mutableListOf<Int>()
//    for (item in 1..5) {
//        val mInput = readLine()?.toInt()
//        if (mInput != null) {
//            mList.add(mInput)
//        }
//    }
//    println("The number in reverse order are :")
//    val mListReverse = mList.reversed()
//    for (item in mListReverse){
//        println(item)
//    }
//          OR
//    for(item in list.size-1 downTo 0){
//    println(mList[item])
//}
//}


//hard
//Accept number from user which larger than one and then calculate the n fibonancy numbers and print those in list

fun main() {
    val mList = mutableListOf(0, 1)
    println("Enter a number n>1 :")
    val mInput = readLine()?.toInt()
    if (mInput!=null){
        for (i in 2 until mInput){
            mList.add(mList[i-2]+mList[i-1])
        }
    }
    println(mList)
}