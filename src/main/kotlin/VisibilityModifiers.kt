/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

//Here we will learn about visibility modifiers
//public, internal, private, protected
fun main() {
    //Visibility modifiers
    val mDetails = "By default everything in kotlin is public, " +
            "which means that everything can be accessed everywhere," +
            "including classes, methods, properties and member variables." +
            "In kotlin Classes, Objects, interfaces, constructors, functions, properties" +
            "and their setters can have visibility modifier."

    val mPublic = "public : public means visible outside the class. Everything is public by default " +
            "including variables and methods and the class"

    val mInternal = "internal : internal means it will only be visible within that module." +
            "A module is a set of kotlin files compiled together, for example, a library or application."

    val mPrivate = "private : private means it will only be visible in that class(or source file " +
            "if you are working with functions)."

    val mProtected = "protected : protected is the same as private, but it will also be visible to any " +
            "subclasses."

    println("Visibility Modifier: ")
    println("------------------------------------------------------------")
    println(mDetails)
    println("------------------------------------------------------------")
    println("------------------------------------------------------------")
    println(mPublic)
    println("------------------------------------------------------------")
    println("------------------------------------------------------------")
    println(mInternal)
    println("------------------------------------------------------------")
    println("------------------------------------------------------------")
    println(mPrivate)
    println("------------------------------------------------------------")
    println("------------------------------------------------------------")
    println(mProtected)
    println("------------------------------------------------------------")


}