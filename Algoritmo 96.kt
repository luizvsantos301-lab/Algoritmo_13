fun main(){
    println("Digite um numero")
    val numero = readln().toDouble()

    if (numero % 3 == 0.0 && numero %7 == 0.0) {
        println("Divisível por 3 e por 7")
    }else{
        println("Não é divisível por 3 e por 7")
        println()
    }
}