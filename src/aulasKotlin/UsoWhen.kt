package aulasKotlin

import java.util.*

fun result(hierarquia: Int) {

    //Switch em java

    when(hierarquia) {
        1 -> {println("A sua função não tem bonificação.")}

        2 -> {print("A sua bonificação é 10%.")}

        3 -> {println("A sua bonificação é 15%")}

        else -> {println("Função indefinida")}

    }
}

fun main() {
    val sc = Scanner(System.`in`)
    println("Qual a sua função no exército?")
    val bonificacao = sc.nextInt()
    println(result(bonificacao))

}