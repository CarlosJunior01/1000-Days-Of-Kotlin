package com.carlosjr.days_of_kotlin.year_2024.a_january.week_04

import com.carlosjr.days_of_kotlin.year_2024.a_january.week_04.BasicSyntaxFour.Companion.arrayNumbers
import com.carlosjr.days_of_kotlin.year_2024.a_january.week_04.BasicSyntaxFour.Companion.arraysAges
import com.carlosjr.extensions.printText

class BasicSyntaxFour {

    fun circumference(radius: Double) = 2 * Math.PI * radius

    companion object {
        const val arraysAges = "val ages = arrayOf(10, 20, 30)\n" +
                "\n" +
                "    val agesList = ages.toMutableList()\n" +
                "    agesList.add(14)"
        const val arrayNumbers = "val numbers = intArrayOf(1, 2, 3)\n" +
                "\n" +
                "    for (i in numbers) {\n" +
                "        printText(i)\n" +
                "    }"
    }
}

fun main() {
    val basicSyntaxFour = BasicSyntaxFour()

    printText(arraysAges)
    val ages = arrayOf(10, 20, 30)
    val agesList = ages.toMutableList()
    agesList.add(14)

    printText ("Array Ages: ${ages[0]}, ${ages[1]}, ${ages[2]}")
    printText(agesList)

    printText(arrayNumbers)
    val numbers = intArrayOf(1, 2, 3)

    for (i in numbers) {
        printText(i)
    }

    printText("Function circumference()")
    printText(basicSyntaxFour.circumference(5.2))

}