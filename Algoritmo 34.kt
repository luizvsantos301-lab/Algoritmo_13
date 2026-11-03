fun main(){
    println("Entre com um numero:")
    val numero = readln().toInt()

    val ant = numero - 1
    val suc = numero + 1

    println("O sucessor é $suc, o antecessor é $ant")
}