package ghm.euler0020

import ghm.euler.solve

fun main() {

    solve(137846528820L) {
        fun pascal(height: Long, values: List<Long> = listOf(1L)): List<Long> {
            if (values.size == height.toInt()) return values
            val scratch = (listOf(0L) + values + listOf(0L))

            return pascal(
                height,
                scratch.indices
                    .filter { it < scratch.size - 1 }
                    .map { scratch[it] + scratch[it + 1] }
            )
        }

        val row = pascal(20 * 2 + 1)
        row[row.size / 2]
    }

}
