fun main() {
    print("digite numero: ")
    val input = readln()
    val num = input.toDoubleOrNull()

    if (num != null) {
        if (num > 20.0 && num < 90.0) {
            println("o número está na faixa de 20 a 90, exclusive")
        } else {
            println("o número está fora da faixa de 20 a 90")
        }
    } else {
        println("Por favor, digite um número válido.")
    }
}



