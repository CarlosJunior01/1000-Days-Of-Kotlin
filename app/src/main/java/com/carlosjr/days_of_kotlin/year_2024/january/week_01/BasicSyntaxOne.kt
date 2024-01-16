package com.carlosjr.days_of_kotlin.year_2024.january.week_01

import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.basicKotlinProgram
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.forInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.functionsInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.ifInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.lambdaInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.whatIsKotlin

class BasicSyntaxOne {

    fun printText(text: String) {
        println("#$text")
        println("# -------------------------------------------------------------------------------- #")
    }
    companion object {
        const val whatIsKotlin: String = "Kotlin is a statically typed programming language that runs " +
                "on the Java Virtual Machine (JVM). \nIt is designed to be concise, expressive, and safe. " +
                "Kotlin is interoperable with Java, which means \nthat you can use Kotlin in your existing " +
                "Java projects."
        const val basicKotlinProgram: String = "Here is an example of a basic Kotlin program:\n " +
                "fun  main (args: Array < String >) {\n" +
                "    println( \"Hello, Kotlin!\" )\n" +
                "}"

        const val ifInKotlin: String = "val x = 10\n" +
                "if (x > 5) {\n" +
                "    println(\"x is greater than 5\")\n" +
                "} else {\n" +
                "    println(\"x is less than or equal to 5\")\n" +
                "}" +
                "\nThis code checks whether x is greater than 5 and prints " +
                "a message to the console accordingly."
        const val forInKotlin: String = "Here is an example of a for loop in Kotlin:\n" +
                "val numbers = arrayOf(1, 2, 3, 4, 5)\n" +
                "\n" +
                "for (number in numbers) {\n" +
                "    println(number)\n" +
                "}\n" +
                "This code iterates over an array of numbers and prints each number to the console."
        const val functionsInKotlin: String = "Kotlin supports functions just like most other programming languages. " +
                "Here is an example of a function in Kotlin:\n" +
                "fun sum(a: Int, b: Int): Int {\n" +
                "    return a + b\n" +
                "}\n" +
                "This code defines a function called sum that takes two integer parameters and returns their sum."
        const val lambdaInKotlin: String = "Kotlin also supports the use of lambda expressions to define functions in a more concise way. Here is an example of a lambda expression in Kotlin:\n" +
                "val sum = { a: Int, b: Int -> a + b }\n" +
                "This code defines a lambda expression that takes two integer parameters and returns their sum."
    }
}

fun main() {
    val baseSyntax = BasicSyntaxOne()
    baseSyntax.printText(whatIsKotlin)
    baseSyntax.printText(basicKotlinProgram)

    //Control Structures
    baseSyntax.printText(ifInKotlin)
    val x = 10
    if (x > 5) {
        baseSyntax.printText("x is greater than 5")
    } else {
        baseSyntax.printText("x is less than or equal to 5")
    }

    baseSyntax.printText(forInKotlin)
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var numberResult = ""

    for (number in numbers) {
        numberResult += "$number "
    }
    baseSyntax.printText(numberResult)

    //Functions
    baseSyntax.printText(functionsInKotlin)
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    baseSyntax.printText(sum(2, 3).toString())

    baseSyntax.printText(lambdaInKotlin)
    val sumLambda = { a: Int, b: Int -> a + b }
    baseSyntax.printText(sumLambda(2, 3).toString())

}