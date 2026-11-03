fun main(){
    println("Medida da diagonal maior")
    val diagmaior = readln().toDouble()
    println("Medida da diagonal menor")
    val diagmenor = readln().toDouble()

    val area = (diagmaior + diagmaior) / 2
    println(area)
}