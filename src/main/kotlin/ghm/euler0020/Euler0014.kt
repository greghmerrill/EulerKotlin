package ghm.euler0020

import ghm.euler.solve

fun main() {

    solve(837_799L) {
        fun collatz(start: Long): Sequence<Long> {
            var value: Long = -1
            return generateSequence {
                value = when(value) {
                    -1L -> start
                    1L -> 0L // zero is used to terminate the sequence
                    else -> if (value % 2 == 0L) value / 2L else 3L * value + 1L
                }

                if (value == 0L) null else value
            }
        }

        (1L..999999L).map { Pair(it, collatz(it).count()) }.maxBy { it.second }?.first
    }

}
