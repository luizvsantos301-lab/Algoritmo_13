#!/usr/bin/env kotlin

class Cozinha {
    var frigideira: Boolean = false
    var ovo: Boolean = false
    var oleo: Boolean = false
    var sal: Boolean = false
    var fogoAceso: Boolean = false
    var oleoQuente: Boolean = false
    var ovoPronto: Boolean = false

    fun executarReceita() {
        // 1 - Pegar frigideira, ovo, óleo e sal
        frigideira = true
        ovo = true
        oleo = true
        sal = true
        println("1. Ingredientes e utensílios pegos.")

        // 2 - Colocar óleo na frigideira
        println("2. Colocando o óleo na frigideira.")

        // 3 - Acender o fogo
        fogoAceso = true
        println("3. Fogo aceso.")

        // 4 - Colocar a frigideira no fogo
        println("4. Frigideira colocada no fogo.")

        // 5 - Esperar o óleo esquentar
        while (!oleoQuente) {
            oleoQuente = true // simulando que o óleo esquentou
        }
        println("5. Óleo quente.")

        // 6 - Colocar o ovo (e o sal)
        println("6. Colocando o ovo e o sal na frigideira.")

        // 7 - Retirar quando pronto
        while (!ovoPronto) {
            ovoPronto = true // simulando o ponto do ovo
        }
        println("7. Ovo retirado da frigideira. Bom apetite!")
    }
}

fun main() {
    val preparo = Cozinha()
    preparo.executarReceita()
}