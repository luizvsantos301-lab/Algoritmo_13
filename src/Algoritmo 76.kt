fun main(){
    println("Digite Numero (0 a 60)")
    val num = scanner.nextDouble()

    val sucessor = (num + 1) % 61
    println("Digite Sucessor ($sucessor)")

}