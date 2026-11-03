fun main(){
    println("Entre com o salário")
    val sm = scanner.nextDouble()
    println("Entre com a quantidade")
    val quantidade = scanner.nextDouble()

    val preco = sm /700
    val vp = preco * quantidade
    val vd = vp * 0.9
    println("Preço do quilowatt: $preco")
    println("Valor a ser pago: $vp")
    println("Valor com desconto: $vd")
}