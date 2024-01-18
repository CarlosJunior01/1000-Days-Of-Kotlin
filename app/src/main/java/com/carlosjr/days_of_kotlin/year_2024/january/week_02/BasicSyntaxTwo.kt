package com.carlosjr.days_of_kotlin.year_2024.january.week_02

import com.carlosjr.days_of_kotlin.year_2024.january.week_02.BasicSyntaxTwo.Companion.ifInKotlin

class BasicSyntaxTwo {

    fun <T>printText(text: T) {
        println("#$text")
        println("# --------------------------------------------------------------------------------------- #")
    }
    companion object {
        const val ifInKotlin: String =
            "In Kotlin, if is not just a statement but an expression, meaning it can return a value. " +
                    "\nThis allows you to write more concise and expressive code." +
                    "\nIn this example, the if expression evaluates whether a is greater than b. If true, " +
                    "\na is returned; otherwise, b is returned. The result is then stored in the max variable."

    }
}

fun main() {
    val baseSyntax = BasicSyntaxTwo()

    //Control Flow: If, When, and Loops
    baseSyntax.printText(ifInKotlin)
    val a = 10
    val b = 20

    val max = if (a > b) a else b
    baseSyntax.printText("Maximum value: $max")
}