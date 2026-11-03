fun main(){
    println("Entrar com o lo termo:")
    val termo72 = readln().toInt()
    println("Entrar com a razão:")
    val razao = readln().toInt()

    val termo702 = termo72 + (702 - 72) * razao

    println("O 702º termo desta P.A. é: $termo702")
}