package ghm.euler

import org.junit.Test
import kotlin.test.assertEquals

class PrimesTest {

    @Test
    fun primes() {
        assertEquals(listOf(), primes(1))
        assertEquals(listOf(2), primes(2))
        assertEquals(listOf(2, 3), primes(4))
        assertEquals(listOf(2, 3, 5), primes(5))
        assertEquals(listOf(2, 3, 5), primes(6))
        assertEquals(listOf(2, 3, 5, 7), primes(10))
        assertEquals(listOf(2, 3, 5, 7, 11, 13, 17, 19), primes(19))
        assertEquals(listOf(2, 3, 5, 7, 11, 13, 17, 19), primes(20))
    }

}
