fun main() {
    print("Digite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a % 100) / 10

    println("algarismo da casa das dezenas: $d")
}