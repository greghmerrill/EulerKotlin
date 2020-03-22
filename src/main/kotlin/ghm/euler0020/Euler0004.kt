package ghm.euler0020

import ghm.euler.solve
import kotlin.math.max

fun main() {

    solve(906_609) {
        fun isPalindrome(i: Int) = i.toString() == i.toString().reversed()

        fun maxPalindromeProduct(a: Int, noLessThan: Int, b: Int = 999): Int {
            val product = a * b
            if (product < noLessThan) return product
            return if (isPalindrome(product)) product else maxPalindromeProduct(a, noLessThan, b - 1)
        }

        var best = 0
        for (i in 999 downTo 1) {
            best = max(best, maxPalindromeProduct(i, best))
        }
        best
    }

}
