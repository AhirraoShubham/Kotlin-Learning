/***************************************************************************************************
 * Copyright (c) 2022. Mr.Ahirrao
 * All right reserved.
 *
 * Learn Kotlin with Mr.Ahirrao
 **************************************************************************************************/

package lambda_functions

//here we will learn about lambda functions
fun main() {
//    //Demo 1
//    var mList = (1..20).toList()
//    println(mList)
//    //here we are filtering the list using lambda function
//    mList = mList.filter { it % 2 == 0 }
//    //list has only even numbers from 1 to 20
//    println(mList)

    //Demo 2
    val circle1 = ClassCircle(5.0)
    val circle2 = ClassCircle(3.5)
    val triangle1 = ClassTriangle(4.0, 4.0, 4.0)
    val triangle2 = ClassTriangle(3.0, 3.0, 3.0)
    val rectangle1 = ClassRectangle(6.0)
    val rectangle2 = ClassRectangle(4.0, 3.0)

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    println("---------------Lambda function--------------------")
    shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name} : Area = ${shape.area()} ")
    }
}

//Extension function that we can call on a list of shape
fun List<ClassShape>.customFilter(filterFunction: (ClassShape) -> (Boolean)): List<ClassShape> {
    val resultList = mutableListOf<ClassShape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}