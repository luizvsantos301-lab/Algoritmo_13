fun main(){
    println("Entre com hora atual")
    val hora = readln().toDouble()
    println("Entre com minutos")
    val minutos = readln().toDouble()

    val tminutos = (hora * 60 + minutos)
    println("Ate agora se passaram: $tminutos")
}