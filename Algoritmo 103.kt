fun main() {
    println("Entre com ano atual")
    val anoa = readln().toIntOrNull()
    println("Entre com ano de nascimento")
    val anon = readln().toIntOrNull()

    if (anoa == null || anon == null) {
        println("Por favor, digite números válidos.")
        return
    }


    if (anon > anoa || anon < 0) {
        println("Ano de Nascimento Invalido")
   } else {
    val idade = anon - anoa
    println("Idade: $idade")
  }
}