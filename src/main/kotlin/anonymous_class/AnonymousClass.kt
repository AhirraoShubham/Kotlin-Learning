/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package anonymous_class

//Here we will learn anonymous class

fun main() {
    val a = 3.0
    val b = 4.0
    val height = 2.0

    val parallelogram = object : ClassShape("Parallelogram", a, b, height) {
        init {
            println("parallelogram created with a = $a, b = $b and height = $height")
            println("Parallelogram area is : ${area()}")
            println("Parallelogram perimeter is :${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b
    }

    println("Is the parallelogram rectangle? ${parallelogram.isRectangle()} \n")


    //HomeWork20
    val mA = 3.0
    val mB = 4.0
    val mC = 5.0
    val mD = 4.0
    val mHeight = 3.87298

    val trapeze = object : ClassShape("trapeze", mA, mB, mC, mD, mHeight) {
        init {
            println("trapeze created with a = $mA, b = $mB, c= $mC, d = $mD and height = $mHeight")
            println("trapeze area is : ${area()}")
            println("trapeze perimeter is :${perimeter()}")
        }

        override fun area(): Double {
            return (mA + mC) * mHeight / 2.0
        }

        override fun perimeter(): Double {
            return mA + mB + mC + mD
        }

        fun isTrapezoidRectangle(): Boolean = mA == mC && mB == mD
    }
    println("Is Trapezoid is rectangle? : ${trapeze.isTrapezoidRectangle()} ")
}
