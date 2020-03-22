package ghm.euler

import java.util.*

private fun newPrimeBitSet(size: Int) = BitSet(size).also { it.set(2, it.size()) }

private fun computePrimesUpTo(upTo: Int, primeBits: BitSet): List<Int> {
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

fun primesUpTo(upTo: Int): List<Int> = computePrimesUpTo(upTo, newPrimeBitSet(upTo + 1))

fun primes(count: Int): List<Int> {
    var upTo = count * 10 // Nothing magical here, just an arbitrary starting point guess for the sieve size
    val primeBits = newPrimeBitSet(upTo)
    var primes: List<Int>
    while (true) {
        primes = computePrimesUpTo(upTo, primeBits)
        if (primes.size >= count) return primes.subList(0, count)
        primeBits.set(upTo + 1, upTo * upTo)
        upTo *= 100
    }
}
