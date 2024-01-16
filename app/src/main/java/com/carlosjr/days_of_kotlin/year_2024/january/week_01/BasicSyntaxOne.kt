package com.carlosjr.days_of_kotlin.year_2024.january.week_01

import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.basicKotlinProgram
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.forInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.functionsInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.ifInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.lambdaInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.variableInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_01.BasicSyntaxOne.Companion.whatIsKotlin

class BasicSyntaxOne {

    fun <T>printText(text: T) {
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

        const val variableInKotlin: String = "In Kotlin, a variable is declared using either the var or val keyword. " +
                "\nThe var keyword is used to declare a variable whose value can be changed later on, " +
                "\nwhile the val keyword is used to declare a read-only variable whose value cannot be " +
                "\nchanged after it is initialized. " +
                "\nHere is an example of declaring a variable in Kotlin:\n" +
                "\n" +
                "var x = 5\n" +
                "val y = \"Hello, World!\"\n" +
                "In this example, x is a variable of type Int with an initial value of 5, while y is a variable of type String " +
                "\nwith an initial value of \"Hello, World!\"."

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

    //Variables
    baseSyntax.printText(variableInKotlin)
    var number = 0
    number = 5
    val text = "Hello, World!"

    baseSyntax.printText(number)
    baseSyntax.printText(text)

    //Here is an example of declaring variables of different data types in Kotlin:
    val a: Int = 10
    val b: Long = 10000000000
    val c: Float = 3.14F
    val d: Double = 3.141592653589793
    val e: Boolean = true
    val f: Char = 'A'
    val g: String = "Hello, World!"

    //Operators
    // Arithmetic operators
    val x = 10
    val y = 5
    val sum = x + y
    val difference = x - y
    val product = x * y
    val quotient = x / y
    val remainder = x % y

// Comparison operators
    val numberFive = 5
    val numberTen = 10
    val greaterThan = numberTen > numberFive
    val lessThan = numberFive < numberTen
    val equalTo = numberFive == numberTen
    val notEqualTo = numberFive != numberTen

// Logical operators
    val trueValue = true
    val falseValue = false
    val and = trueValue && falseValue
    val or = trueValue || falseValue
    val not = !trueValue

    //Control Structures
    baseSyntax.printText(ifInKotlin)
    if (numberTen > numberFive) {
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
    baseSyntax.printText(sum(2, 3))

    baseSyntax.printText(lambdaInKotlin)
    val sumLambda = { a: Int, b: Int -> a + b }
    baseSyntax.printText(sumLambda(2, 3))

}