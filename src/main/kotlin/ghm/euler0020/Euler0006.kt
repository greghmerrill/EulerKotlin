package ghm.euler0020

import ghm.euler.solve

fun main() {

    solve(25_164_150L) {
        val numbers = 100L
        fun sumOfSquares(n: Long): Long = (1L..n).map { (it * it) }.sum()
        fun squareOfSum(n: Long): Long {
            val sum = (1L..n).fold(0L) { sum, i -> sum + i }
            return sum * sum
        }
        squareOfSum(numbers) - sumOfSquares(numbers)
    }

}
