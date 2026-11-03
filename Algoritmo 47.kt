fun main(){
    println("Entre com um número de 3 dígitos")
    val num = scanner.nextDouble()
    val c = num / 100
    val d = num % 100 / 10
    val u = num % 10

    val numIntrevido = (u * 100) + (d * 10) + c
}



