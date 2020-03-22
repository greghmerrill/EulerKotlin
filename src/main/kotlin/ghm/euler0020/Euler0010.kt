package ghm.euler0020

import ghm.euler.primesUpTo
import ghm.euler.solve

fun main() {

    solve(142_913_828_922L) {
        primesUpTo(2_000_000 - 1).map { it.toLong() }.sum()
    }

}
