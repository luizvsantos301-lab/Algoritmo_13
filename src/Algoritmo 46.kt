import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Digite Saldo")
    val saldo = scanner.nextDouble()

    val nsaldo = saldo * 1.01
    println("Saldo: $nsaldo")
}