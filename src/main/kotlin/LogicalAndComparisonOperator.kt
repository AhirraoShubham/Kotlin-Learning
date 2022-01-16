/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//we will learn logical and comparison operator here
//COMPARISON OPERATOR
// = (single equal) : means assign the value to variable
// == (double equal/ equal equal) : means check the two values are equals
// < (single less than) : means check left variable value is less than right variable value
// > (single greater than) : means check left variable value is greater than right variable value
// <= (less than equal too)  : means check left variable value is less than or equal to right variable value
// >= (greater than equal too)  : means check left variable value is greater than or equal to right variable value
// != (not equal) : means check the two value are not equals

//LOGICAL OPERATOR
// && (and and) : means it check left operation result and right operation result and returns true if both are returns true otherwise returns false
// || (or or) : means it check left operation result or right operation result and returns true if one operation returns true it returns true otherwise returns false
// ! (not) : means it returns the opposite result of operations result.


//*All Operator returns result in boolean(true/false) value.*

fun main() {

    val mNum1 = 11
    val mNum2 = 11

    val mNumA = 51
    val mNumB = 21

    //COMPARISON OPERATOR
    //equal equal
    println("== operator result : ${mNum1 == mNum2}")
    //less than
    println("< operator result : ${mNum1 < mNum2}")
    //greater than
    println("> operator result : ${mNum1 > mNum2}")
    //less than equal to
    println("<= operator result : ${mNum1 <= mNum2}")
    //greater than equal to
    println(">= operator result : ${mNum1 >= mNum2}")
    //not equal
    println("!= operator result : ${mNum1 != mNum2}")

    //LOGICAL OPERATOR
    //AND-AND
    println("&& Operator result : ${mNum1 == mNum2 && mNumA == mNumB}")
    //OR-OR
    println("|| Operator result : ${mNum1 == mNum2 || mNumA == mNumB}")
    //NOT
    println("! Operator result : ${!(mNum1 == mNum2 || mNumA == mNumB)}")
}