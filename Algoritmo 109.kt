import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("\nDigite 1º nome: ")
    val nome1 = scanner.nextLine()

    print("\nDigite 2º nome: ")
    val nome2 = scanner.nextLine()

    if (nome1 < nome2) {
        println("\n$nome1, $nome2")
    } else {
        println("\n$nome2, $nome1")
    }

    println()
}