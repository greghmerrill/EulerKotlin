package ghm.euler

import java.util.*

fun primes(upTo: Int): List<Int> {
    val primeBits = BitSet(upTo + 1)
    primeBits.set(2, primeBits.size())
    for (i in 2..upTo) {
        if (primeBits.get(i)) {
            for (j in (i * 2)..upTo step i) {
                primeBits.clear(j)
            }
        }
    }

    var i = upTo + 1
    fun nextPrime(): Int? {
        while (i-- > 1) {
            if (primeBits.get(i)) {
                return i
            }
        }
        return null
    }

    return generateSequence(::nextPrime).toList().reversed()
}