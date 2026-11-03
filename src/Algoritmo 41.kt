import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Entrada de dados
    print("Entre com o 1º número: ")
    val a = scanner.nextDouble()

    print("Entre com o 2º número: ")
    val b = scanner.nextDouble()

    print("Entre com o 3º número: ")
    val c = scanner.nextDouble()

    print("Entre com o 4º número: ")
    val d = scanner.nextDouble()

    // Cálculo da média ponderada (pesos: 1, 2, 3 e 4. Soma dos pesos = 10)
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10

    // Saída do resultado
    println("Média ponderada: $mp")
}







