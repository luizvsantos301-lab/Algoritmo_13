fun main(){
    println("Numero de 3 Algorismos")
    val num = readln().toDouble()
    val c = num / 100

    if (c % 2 == 0.0) {
        println("O Algarismo das centenas e par:")
    }  else{
        println("O Algarismo das centenas e impar:")    
    }
}