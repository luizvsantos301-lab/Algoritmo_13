fun main() {
    print("\n\ndigite numero: ")
    val numero = readln().toDoubleOrNull()

    if (numero != null && numero > 20.0) {
        println(numero)
    }
    println()
}


