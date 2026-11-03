fun main(){
    println("Digite 1 numero")
    val num1 = readln().toInt()
    println("Digite 2 numero")
    val num2 = readln().toInt()

    val soma = num1 + num2
    if (soma > 10)
        println("Soma: $soma")
}