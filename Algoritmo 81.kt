fun main(){
    println("Digite conta de três digitos")
    val conta = scanner.nextDouble()

    val d1 = conta / 100.0
    val d2 = conta % 100.0 / 10.0
    val d3 = conta % 100 % 10.0
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    val d11 = (soma / 100) * 1
    val d22 = (soma % 100 % 10) * 2
    val d33 = (soma % 100 % 10) * 3
    val digito = (d11 + d22 + d33) % 10
    println("Digito verificador: $digito")
}