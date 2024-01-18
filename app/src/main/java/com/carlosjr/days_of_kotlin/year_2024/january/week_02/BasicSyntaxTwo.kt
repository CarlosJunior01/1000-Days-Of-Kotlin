package com.carlosjr.days_of_kotlin.year_2024.january.week_02

import com.carlosjr.days_of_kotlin.year_2024.january.week_02.BasicSyntaxTwo.Companion.forInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_02.BasicSyntaxTwo.Companion.ifInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_02.BasicSyntaxTwo.Companion.whenInKotlin

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

        const val whenInKotlin: String =
            "The when expression in Kotlin is a powerful and versatile alternative to the traditional" +
                    "\nswitch statement found in other programming languages. It can match a value " +
                    "\nagainst multiple branches, making it easy to handle various conditions. " +
                    "\nHere's an example:\n" +
                "\n" +
                "fun main() {\n" +
                "    val number = 3\n" +
                "\n" +
                "    when (number) {\n" +
                "        1 -> println(\"One\")\n" +
                "        2 -> println(\"Two\")\n" +
                "        3 -> println(\"Three\")\n" +
                "        else -> println(\"Unknown number\")\n" +
                "    }\n" +
                "}\n" +
                "In this example, the when expression checks the value of the number variable against " +
                    "\neach branch. If a match is found, the corresponding block of code is executed."

        const val forInKotlin: String =
            "In Kotlin, for loops are used to iterate over ranges, arrays, or other iterable objects. " +
                    "\nHere's an example:" +
                "\n" +
                "fun main() {\n" +
                "    val names = arrayOf(\"John\", \"Jane\", \"Doe\")\n" +
                "\n" +
                "    for (name in names) {\n" +
                "        println(\"Hello, name!)\n" +
                "    }\n" +
                "}\n" +
                "In this example, the for loop iterates over the names array and prints a greeting " +
                    "\nfor each name."
    }
}

fun main() {
    val baseSyntax = BasicSyntaxTwo()

    //Control Flow: If
    baseSyntax.printText(ifInKotlin)
    val a = 10
    val b = 20

    val max = if (a > b) a else b
    baseSyntax.printText("Maximum value: $max")

    //Control Flow: When
    baseSyntax.printText(whenInKotlin)
    val number = 3

    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Unknown number")
    }
    baseSyntax.printText("Maximum value: $max")

    //Control Flow: Loops - For
    baseSyntax.printText(forInKotlin)
    val names = arrayOf("John", "Jane", "Doe")

    for (name in names) {
        baseSyntax.printText("Hello, $name!")
    }
}