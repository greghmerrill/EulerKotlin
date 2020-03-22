package ghm.euler0020

import ghm.euler.solve
import kotlin.math.sqrt

fun main() {

    solve(76_576_500) {
        fun divisors(n: Int): Int {
            return (1..sqrt(n.toFloat()).toInt()).map {
                when (n % it) {
                    0 -> if (n / it == it) 1 else 2
                    else -> 0
                }
            }.sum()
        }

        fun triangleNumbers(): Sequence<Int> {
            var sum = 0
            var next = 1
            return generateSequence { sum += next; next += 1; sum }
        }

        triangleNumbers().find { divisors(it) > 500 }
    }

}
