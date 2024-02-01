package com.carlosjr.days_of_kotlin.year_2024.b_february.week_05

import com.carlosjr.extensions.printText

fun main() {

    val somaSimplesLambda: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
    val somaLambdaResumida = {a: Int, b: Int -> a + b}
    val funcLambdaInfo = {num1: Int, num2: Int -> printText("Soma: ${num1 + num2}") }

    printText("Função Lambda Simples: \n(Int, Int) -> Int = { num1, num2 -> num1 + num2 }")
    printText(somaSimplesLambda(2, 3)) // Output: 5

    printText("Função Lambda Simples Resumida \n{a: Int, b: Int -> a + b}:")
    printText(somaLambdaResumida(2, 3)) // Output: 5

    printText("Função Lambda Simples Com Impressão: \n{num1: Int, num2: Int -> println(Soma: num1 + num2) }")
    funcLambdaInfo(2, 3)

    printText("Função Lambda Com Parâmetro Implícito: \n(Int) -> Int = {it * it}")
    val quadrado: (Int) -> Int = {
        it * it
    }
    printText(quadrado(4))

}