fun main(){
    println("Digite um numero")
    val numero = readln().toDouble()

    if(numero > 20)
        println("Maior que vinte")
    else
    if (numero < 20)
        println("Menor que vinte")
    else
        println("Igual a 20")
}