fun main(){
    println("Entre com deposito")
    val deposito = scanner.nextDouble()
    println("Entre com a taxa de juros")
    val taxa = scanner.nextDouble()

    val valor = deposito * taxa/100
    val total = deposito + valor
    println("Valor da conta com total: $total")
    println("Total: $total")
}