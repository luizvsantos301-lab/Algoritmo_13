import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Entrada dos dados
    print("Digite a data no formato ddmmaa: ")
    val data = scanner.nextInt()

    // Processamento matemático para extrair dia, mês e ano
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100

    // Saída dos dados formatados
    println("\nDIA: $dia")
    println("MÊS: $mes")
    println("ANO: $ano")
}