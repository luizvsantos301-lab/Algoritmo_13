fun main (){
    println("Horas trabalhando")
    val na = readln().toDouble()
    println("Valor da hora-aula")
    val vha =readln().toDouble()

    println("Percentual de Desconto")
    val pd =readln().toDouble()
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("Salario liquido: $sl")
}