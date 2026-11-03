fun main(){
    fun main(){
        println("Entre Nota 1:")
        val nota1 = readln() ?: ""

        println("Entre Nota 2:")
        val nota2 = readln() ?: ""

        val media = (nota1 + nota2) / 2

        println(media)
    }

}

operator fun String.div(i: Int) {}


