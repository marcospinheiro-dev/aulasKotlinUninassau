package aulasKotlin

fun main() {

    val c: Array<Double>
    c = arrayOf(5.12, 4.80, 4.60, 5.20, 3.50, 5.00)
    var ganho = 0.0
    var firstI = 0
    var lastI = 1
    var iCompra = 0
    var iVenda = 1

    while (lastI < c.size) {
        if (ganho < c[lastI] - c[firstI]) {
            ganho = c[lastI] - c[firstI]
            iCompra = firstI
            iVenda = lastI
        }
        if (c[lastI] < c[firstI]) {
            firstI = lastI
        }
            lastI++
    }
    println("Compra = $iCompra")
    println("Venda = $iVenda")
    println("Ganho = $ganho")

}