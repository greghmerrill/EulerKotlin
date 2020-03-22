package ghm.euler0020

import ghm.euler.solve

import kotlin.math.pow

fun main() {

    solve(233_168) {
        val max = 999

        fun sumOfFactors(factor: Int): Int {
            val occurrences = ((max / factor).toFloat().pow(2) + (max / factor)) / 2
            return factor * occurrences.toInt()
        }

        sumOfFactors(3) + sumOfFactors(5) - sumOfFactors(15)
    }

}