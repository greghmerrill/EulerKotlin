package ghm.euler

import org.junit.Test
import kotlin.test.assertEquals

class PrimesTest {

    @Test
    fun primesUpTo() {
        assertEquals(listOf(), primesUpTo(1))
        assertEquals(listOf(2), primesUpTo(2))
        assertEquals(listOf(2, 3), primesUpTo(4))
        assertEquals(listOf(2, 3, 5), primesUpTo(5))
        assertEquals(listOf(2, 3, 5), primesUpTo(6))
        assertEquals(listOf(2, 3, 5, 7), primesUpTo(10))
        assertEquals(listOf(2, 3, 5, 7, 11, 13, 17, 19), primesUpTo(19))
        assertEquals(listOf(2, 3, 5, 7, 11, 13, 17, 19), primesUpTo(20))
    }

    @Test
    fun primes() {
        assertEquals(listOf(2), primes(1))
        assertEquals(listOf(2, 3), primes(2))
        assertEquals(listOf(2, 3, 5), primes(3))
        assertEquals(listOf(2, 3, 5, 7), primes(4))
        assertEquals(listOf(2, 3, 5, 7, 11, 13, 17, 19), primes(8))
    }
}
