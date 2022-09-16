package aulasKotlin

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    var result = Int.MIN_VALUE
    val A = sc.nextInt()
    val B = sc.nextInt()
    val C = sc.nextInt()

    if(result < A) {
        result = A
    }
    if (result < B) {
        result = B
    }
    if (result < C) {
        result = C
    }
    println("$result é o maior")

}