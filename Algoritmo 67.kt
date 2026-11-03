fun main (){
    println("Digite o valor da prestacão")
    val valor = readln().toDouble()
    println("Digite a taxa")
    val taxa = readln().toDouble()
    println("Digite o tempo")
    val temp = readln().toDouble()

    val prest = valor + (valor * (taxa/100) * temp)
    println("O valor da prestação em atraso: $prest")
}