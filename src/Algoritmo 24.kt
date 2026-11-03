fun main() {
    print("Digite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a / 10) % 10

    println("algarismo da casa das dezenas: $d")
}