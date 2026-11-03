import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Digite 1 numero com ponto")
    var a = scanner.nextDouble()
    println("Digite 2 numero com ponto")
    var b = scanner.nextDouble()
    val aux = a
    a = b
    b = aux
    println("Novo valor de A: $a")
    println("Novo valor de B: $b")

}