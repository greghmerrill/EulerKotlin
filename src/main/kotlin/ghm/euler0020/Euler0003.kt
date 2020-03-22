package ghm.euler0020

import ghm.euler.primesUpTo
import ghm.euler.solve
import kotlin.math.sqrt

fun main() {

    solve(6857) {
        val target = 600_851_475_143
        val maxFactor = sqrt(target * 1.0).toInt()
        primesUpTo(maxFactor).reversed().find { target % it == 0L }
    }

}
