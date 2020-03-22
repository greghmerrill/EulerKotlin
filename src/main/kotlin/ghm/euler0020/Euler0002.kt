package ghm.euler0020

import ghm.euler.solve

fun main() {

    solve(4_613_732) {
        val max = 4_000_000

        var nm2 = 0
        var nm1 = 1
        val fibs = generateSequence {
            val next = nm2 + nm1
            nm2 = nm1
            nm1 = next
            next.takeIf { it <= max }
        }

        fibs.fold(0) { sum, next ->
            sum + if (next % 2 == 0) next else 0
        }
    }
}