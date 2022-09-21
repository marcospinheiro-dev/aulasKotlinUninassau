package aulasKotlin

fun main (args: Array<String>) {

    val cotacao: Array<Double>

    cotacao = arrayOf(5.12, 4.80, 4.60, 5.20, 3.50, 5.00)
    var compra = 0.0
    var venda = 0.0
    var result = 0.0

    for ((i, value) in cotacao.withIndex()){
       for ((j, value) in cotacao.withIndex()) {
           if (j > i) {
               if (cotacao[i] - cotacao[j] < result) {
                   result = cotacao[i] - cotacao[j]
                   compra = cotacao[i]
                   venda = cotacao[j]
               }
           }
       }
    }
    println("Compra: $compra")
    println("Venda: $venda")
}




