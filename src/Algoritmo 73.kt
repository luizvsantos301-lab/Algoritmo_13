fun main(){
    println("Entre com um numero com parte francionaria:")
    val numero = scanner.nextDouble()
    val numi = (numero - 0.5).toInt()
    val numfrac = numero - numi
    val numa = (numero + 0.00001).toInt()

    println("parte inteira: $numi")
    println("parte fracionaria: ${String.format("%.3f", numfrac + 0.00001)}")
    println("parte fracionaria real: ${String.format("%.3f", numfrac)}")
    println("numero arredondado: $numa")
}
