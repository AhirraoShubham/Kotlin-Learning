/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//here we will learn about var argument, Default argument and parameter
//vararg keyword means that we can have a variable number of argument, we can treat as a list


//VARARG
fun main() {
    //for VARARG
//    val myMax = getMax(2, 5, 9, 7, 4, 5, 8, 9, 6, 4, 1, 2, 11, 58, 69, 9)
//    println("The max number in list is : $myMax")

    //we can also do like this
//    val myArr = intArrayOf(15, 95, 48)
//    val myMax = getMax(2, 5, 9, 7, *myArr/*this is cool*/, 4, 5, 8, 9, 6, 4, 1, 2, 11, 58, 69, 9)
//    println("The max number in list is : $myMax")

    //for DEFAULT
    searchFor("How to become a good programmer")
    searchFor("How to become a best kotlin programmer", "bing")

    //for NAMED PARAMETERS
    searchFor(search = "How to become a Android developer", searchEngine = "firefox")
    //here you don't need to take care about parameter sequence because we are using named parameter
    searchFor(searchEngine = "edge", search = "how to become a java developer")
}

//for default
fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for $search on $searchEngine")
}

//for varArg
fun getMax(vararg numbers: Int): Int {
    var mMax = numbers[0]
    for (number in numbers) {
        if (number > mMax) {
            mMax = number
        }
    }
    return mMax
}
