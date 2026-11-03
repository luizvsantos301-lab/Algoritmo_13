fun main() {
    print("digite 1º numero: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("digite 2º numero: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    if (a == b) {
        println("iguais")
    } else {
        println("diferentes")
    }
}