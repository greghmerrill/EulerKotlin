package ghm.euler0020

import ghm.euler.solve
import java.math.BigInteger

fun main() {

    solve(1366) {
        BigInteger("2").pow(1000).toString()
            .fold(0) { sum, c -> Integer.parseInt("" + c) + sum }
    }

}
