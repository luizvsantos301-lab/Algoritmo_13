fun main() {
    print("Número de 4 algarismos: ")
    val numInput = readln()
    val num = numInput.toInt()

    // Extrai os dois primeiros algarismos (unidade de milhar e centena)
    // Exemplo: 4567 / 100 = 45
    val c = num / 100

    if (c % 4 == 0) {
        println("O número é múltiplo de 4: $c")
    } else {
        println("O número não é múltiplo de 4: $c")
    }
}