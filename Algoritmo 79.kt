import kotlin.math.pow

fun main(){
    println("Digite o valor da aplicação mensal:")
    val p = scanner.nextDouble()
    println("Digite a taxa de juros:")
    val i = scanner.nextDouble()
    println("Digite o número de meses:")
    val n = scanner.nextDouble()

    val va = p * (((1 + i).pow(n - 1)) / i)
    println("O valor acumulado: R$ %.2f".format(va))
}