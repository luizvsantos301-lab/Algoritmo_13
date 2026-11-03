import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)

    // Declaração das variáveis
    val altura: Double
    val raio: Double
    val volume: Double
    val pi = 3.14159

    // Entrada de dados: Altura
    print("Digite a altura da lata: ")
    altura = scanner.nextDouble()

    // Entrada de dados: Raio
    print("Digite o raio da lata: ")
    raio = scanner.nextDouble()

    // Cálculo do volume (raio elevado ao quadrado usando pow)
    volume = pi * raio.pow(2.0) * altura

    // Apresentação do resultado
    println("\nO volume da lata é: ${String.format("%.2f", volume)}")
}
