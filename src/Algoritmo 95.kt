fun main(){
    println("Digite um numero")
    val numero = readln().toDouble()

    if (numero % 5 == 0.0) {
        println("divisivel por 5")
    }else{
        println("Não é divisivel por 5")
        println()
    }
}