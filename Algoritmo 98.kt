fun main(){
    println("Digite o Salario")
    val sb = readln().toDouble()
    println("Digite o valor da prestação")
    val vp = readln().toDouble()

    if (vp <= 0.3 * sb)
        println("Emprestimo concedido")
    else
        println("Emprestimo negado")
}
