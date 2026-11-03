fun main(toInt: Unit.() -> Unit) {
    println("Digite Pr1")
    val pr1 = readln().toDouble()
    println("Digite Pr2")
    val pr2 = readln().toDouble()

    val mf = (pr1 + pr2) / 2
    val mediaTruncada = mf.toInt()
    val mediaArredondada = (mf + 0.5).toInt()

    println("media arredondada $mediaArredondada")
    println("nedia truncada $mediaArredondada")


}