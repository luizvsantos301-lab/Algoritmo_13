fun main(){
    println("Digite a quantidade de fitas:")
    val quant = scanner.nextDouble()
    println("Digite o valor do aluguel:")
    val alug = scanner.nextDouble()

    val fatanual = quant / 3 * alug * 12
    println("Faturamento anual: $fatanual")
    val multas = alug * 0.1 * (quant / 3) / 10
    println("Multas mensais: $multas")
    val quantFinal = quant - (quant * 0.02) + (quant/10)
    println("Quant: $quantFinal")
}