package ghm.euler0020

import ghm.euler.primesUpTo
import ghm.euler.solve
import kotlin.math.pow

fun main() {

    solve(232_792_560) {
        val max = 20
        val primes = primesUpTo(max)

        fun primeFactors(n: Int): List<Int> {
            var remainder = n
            val factors = mutableListOf<Int>()
            for (prime in primes) {
                if (prime > remainder) break
                while (remainder % prime == 0) {
                    factors.add(prime)
                    remainder /= prime
                }
            }
            return factors
        }

        val factorCount = mutableMapOf<Int, Int>()
        for (i in 2..max) {
            for ((factor, count) in primeFactors(i).groupingBy { it }.eachCount()) {
                if (factorCount.getOrDefault(factor, 0) < count) {
                    factorCount[factor] = count
                }
            }
        }

        factorCount.flatMap { listOf(it.key.toFloat().pow(it.value).toInt()) }
            .fold(1) { product, next -> product * next }
    }

}
