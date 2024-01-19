package com.carlosjr.days_of_kotlin.year_2024.january.week_03

import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.destructuring
import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.doWhileInKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.elvisOperator
import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.iteratingListWithIndices
import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.loopForKotlin
import com.carlosjr.days_of_kotlin.year_2024.january.week_03.BasicSyntaxThree.Companion.whileLoopKotlin
import java.util.Scanner

class BasicSyntaxThree {

    fun <T> printText(text: T) {
        println("#$text")
        println("# --------------------------------------------------------------------------------------- #")
    }

    companion object {
        const val loopForKotlin: String =
            "For Loop\n" +
                    "In Kotlin, for loops are commonly used to iterate over ranges, arrays, or other " +
                    "\niterable objects. Let's explore some more examples of for loops in action:" +
                    "\n" +
                    "Iterating Over a Range\n" +
                    "fun main() {\n" +
                    "    for (i in 1..5) {\n" +
                    "        println(\"Number: i)\n" +
                    "    }\n" +
                    "}\n" +
                    "This example demonstrates iterating over a range of numbers from 1 to 5, inclusive."

        const val iteratingListWithIndices: String =
            "Iterating Over a List with Indices\n" +
                    "fun main() {\n" +
                    "    val animals = listOf(Dog, Cat, Elephant, Giraffe)\n" +
                    "\n" +
                    "    for (index in animals.indices) {\n" +
                    "        println(Animal at index index: {animals[index]})\n" +
                    "    }\n" +
                    "}\n" +
                    "In this example, we use the indices property of a list to iterate over its indices and access the elements."

        const val whileLoopKotlin: String =
            "While Loop\n" +
                    "The while loop is used when you want to repeat a block of code as long as a certain condition is true. Let's dive into some more examples of while loops in action:\n" +
                    "\n" +
                    "Iterating Until a Condition is Met\n" +
                    "fun main() {\n" +
                    "    var sum = 0\n" +
                    "    var number = 1\n" +
                    "\n" +
                    "    while (sum < 10) {\n" +
                    "        sum += number\n" +
                    "        number++\n" +
                    "    }\n" +
                    "\n" +
                    "    println(Sum: sum)\n" +
                    "}\n" +
                    "In this example, we use a while loop to find the smallest sum of consecutive natural numbers greater than 10."

        const val doWhileInKotlin: String =
            "Do-While Loop\n" +
                    "The do-while loop is similar to the while loop, but the block of code is executed " +
                    "\nat least once, regardless of the condition. Let's take a look at a do-while " +
                    "\nloop example:\n" +
                    "\n" +
                    "Reading User Input Until Valid\n" +
                    "import java.util.Scanner\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    val scanner = Scanner(System.`in`)\n" +
                    "    var number: Int\n" +
                    "\n" +
                    "    do {\n" +
                    "        print(\"Enter a positive number: \")\n" +
                    "        number = scanner.nextInt()\n" +
                    "    } while (number <= 0)\n" +
                    "\n" +
                    "    println(You entered: number)\n" +
                    "}\n" +
                    "In this example, we use a do-while loop to repeatedly request user input until " +
                    "\na positive number is entered."

        const val elvisOperator: String =
            "When you have a nullable reference, person.name, you can say if person.name is not null, " +
                    "\nuse it, otherwise use some non-null value: “unknown”" +
                    "val name: String = person.name ?: “unknown”\n" +
                    "val age = person.age ?: return"

        const val destructuring: String =
            "Sometimes it is convenient to destructure an object into a number of variables, for example:\n" +
                    "\n" +
                    "val (name, age) = person\n" +
                    "This syntax is called a destructuring declaration. A destructuring declaration " +
                    "\ncreates multiple variables at once. You have declared two new variables: name " +
                    "\nand age, and can use them independently:" +
                    "\n(Name = {name}, Age = {age})"
    }
}

fun main() {
    val baseSyntax = BasicSyntaxThree()

    //Loop: For
    baseSyntax.printText(loopForKotlin)

    for (i in 1..5) {
        baseSyntax.printText("Number: $i")
    }

    //Loop: For with index
    baseSyntax.printText(iteratingListWithIndices)
    val animals = listOf("Dog", "Cat", "Elephant", "Giraffe")

    for (index in animals.indices) {
        baseSyntax.printText("Animal at index $index: ${animals[index]}")
    }

    //Loop: While
    baseSyntax.printText(whileLoopKotlin)
    var sum = 0
    var number = 1

    while (sum < 10) {
        sum += number
        number++
    }

    baseSyntax.printText("Sum: $sum")

    //Loop: Do While
    baseSyntax.printText(doWhileInKotlin)
    val scanner = Scanner(System.`in`)
    var numberInt: Int

    do {
        print("Enter a positive number: ")
        numberInt = scanner.nextInt()
    } while (numberInt <= 0)

    baseSyntax.printText("You entered: $numberInt")

    //Elvis Operator
    baseSyntax.printText(elvisOperator)
    val personName: String? = null
    val personAge: Int? = 18
    val testName: String = personName ?: "unknown"
    val testAge = personAge ?: return

    baseSyntax.printText("Name is $testName, age is $testAge")

    //Destructuring declarations
    baseSyntax.printText(destructuring)
    val person = Person("Goku", 30)
    val (name, age) = person
    baseSyntax.printText("Name = $name, Age = $age")
}

data class Person(val name: String, val age: Int)