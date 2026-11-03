import kotlin.math.*

fun main() {
    // Função auxiliar para formatar com casas decimais (equivalente a formatar(val, casas))
    fun formatar(valor: Double, casas: Int): String {
        return "%.${casas}f".format(valor)
    }

    // Equivalente a realint (truncar/converter para Int)
    fun realint(valor: Double): Int {
        return valor.toInt()
    }

    // Equivalente a intreal (converter para Double)
    fun intreal(valor: Int): Double {
        return valor.toDouble()
    }

    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${realint(exp(0.5 * ln(64.0)))}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println(" ${formatar(sin(45.0 * PI / 180.0) + 0.0001, 3)}")
    println("potencia com exp e log e formatar: ${formatar(exp(3.0 * ln(8.0)) + 0.001, 3)}")
    println("potencia com exp e log sem formatar: ${exp(3.0 * ln(8.0))}")
    println("potencia com operador** (pow) e formatar: ${formatar(8.0.pow(3.0), 3)}")
    println("raiz cubica: ${exp((1.0 / 3.0) * ln(8.0))}") // ou cbrt(8.0)
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${realint(5.5)}")
    println("convertendo para inteiro 6.5: ${realint(6.5)}")
    println("convertendo para inteiro 6.5 + 0.0001: ${realint(6.5 + 0.0001)}")
    println("convertendo para inteiro 5.45: ${realint(5.45)}")
    println("convertendo para inteiro 5.51: ${realint(5.51)}")
    println("convertendo para real 87: ${intreal(87)}")
    println("convertendo para int 3/4: ${realint(3.0 / 4.0)}")
}