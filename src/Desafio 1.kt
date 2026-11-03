data class State(
    val mLeft: Int,
    val cLeft: Int,
    val boat: Int, // 1 = esquerda, 0 = direita
    val mRight: Int,
    val cRight: Int
) {
    fun isValid(): Boolean {
        if (mLeft < 0 || cLeft < 0 || mRight < 0 || cRight < 0) return false
        if (mLeft > 0 && mLeft < cLeft) return false
        if (mRight > 0 && mRight < cRight) return false
        return true
    }

    fun isGoal(): Boolean = mLeft == 0 && cLeft == 0 && boat == 0
}

fun solve(): List<State>? {
    val initial = State(3, 3, 1, 0, 0)
    val queue = ArrayDeque<List<State>>()
    queue.add(listOf(initial))
    val visited = mutableSetOf(initial)

    // Possíveis cargas do bote: (deltaM, deltaC)
    val moves = listOf(
        Pair(1, 0),
        Pair(2, 0),
        Pair(0, 1),
        Pair(0, 2),
        Pair(1, 1)
    )

    while (queue.isNotEmpty()) {
        val path = queue.removeFirst()
        val current = path.last()

        if (current.isGoal()) return path

        val multiplier = if (current.boat == 1) -1 else 1

        for ((mMove, cMove) in moves) {
            val nextM = current.mLeft + (mMove * multiplier)
            val nextC = current.cLeft + (cMove * multiplier)
            val nextBoat = 1 - current.boat
            val nextMR = 3 - nextM
            val nextCR = 3 - nextC

            val nextState = State(nextM, nextC, nextBoat, nextMR, nextCR)

            if (nextState.isValid() && nextState !in visited) {
                visited.add(nextState)
                queue.add(path + nextState)
            }
        }
    }
    return null
}

fun main() {
    val solution = solve()
    solution?.forEachIndexed { index, state ->
        println("Passo $index: L(M=${state.mLeft}, C=${state.cLeft}, B=${state.boat}) -> R(M=${state.mRight}, C=${state.cRight})")
    }
}