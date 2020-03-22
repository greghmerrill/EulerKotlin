package ghm.euler0020

import ghm.euler.solve
import kotlin.math.sqrt

fun main() {

    solve(31_875_000) {
        val sum = 1000
        var solution: Int? = null
        for (a in 1..(sum - 2)) {
            for (b in a until (sum - 1)) {
                val a2pb2 = (a*a) + (b*b)
                val c = sqrt(a2pb2.toFloat()).toInt()
                if (c*c == a2pb2) {
                    if (a + b + c == sum) {
                        solution = a * b * c
                        break
                    }
                }
            }
        }
        solution
    }

}
