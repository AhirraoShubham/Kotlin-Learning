/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//We will learn a for loop here

fun main() {
//    for loop 1
    val mArr = arrayOf(1, 2, 5, 9, 4, 6, 2, 3, 4)
    var max = mArr[0]
    for(item in mArr){
        if (item>max){
            max = item
        }
    }
    print("Max number in Array : $max")

//    //for loop
//    for (i in mArr) {
//        println(i)
//    }

//    //range loop
//    for (i in 1..11) {  // we can set any range e.g 5..12, 'a'..'z' etc
//        println(i)
//    }

//    // loop for reverse
//    for (i in 10 downTo 5) {
//        println(i)
//    }

//    //modifications
//    for(i in 10 downTo 2 step 2){  //range with step
//        println(i)
//    }
}