/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/


//Main Function
fun main(){
    //VAR - mutable/changeable variable   //mutable means we can reinitialize variable in our program
    var myVariable = 11
    println("Value in my variable is : $myVariable")
    myVariable = 21  //ALLOWED
    println("Reinitialize value is: $myVariable")

    //VAL - immutable/unchangeable variable  //immutable means we cannot reinitialize a variable after initialize once.
    val myVal = 51
    //myVal = 101      //NOT ALLOWED
    println("Value of my val is: $myVal")
}