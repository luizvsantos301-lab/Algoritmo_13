fun main() {
    // 1 - Vejo a previsão do tempo
    println("1 - Vendo a previsão do tempo...")
    print("Como está o tempo? (Digite 'sol' ou 'chuva'): ")
    val previsaoDoTempo = readlnOrNull()?.lowercase() ?: ""

    // 2 - Se (fizer sol) vou à praia; senão vou estudar
    if (previsaoDoTempo == "sol") {
        println("2 - Está sol! Vou à praia. ")
    } else {
        println("2 - Não está sol. Vou estudar. ")
    }

    // 3 - Almoçar
    println("3 - Almoçar ")

    // 4 - Ver televisão
    println("4 - Ver televisão ")

    // 5 - Dormir
    println("5 - Dormir ")
}