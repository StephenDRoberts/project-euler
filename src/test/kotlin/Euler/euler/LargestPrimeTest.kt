package Euler.euler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LargestPrimeTest {

    private val largestPrime = LargestPrime()

    @Test
    fun `largest prime of 13195 is 29`() {
        val answer = largestPrime.findLargestPrime(13195)

        assertEquals(29, answer)
    }

    @Test
    fun `largest prime of 600851475143 is ???`() {
        val answer = largestPrime.findLargestPrime(600851475143)

        assertEquals(6857, answer)
    }


    @Test
    fun `2 is a prime`(){
        val answer = largestPrime.checkIfPrime(2)

        assertEquals(true, answer)
    }
    @Test
    fun `3 is a prime`(){
        val answer = largestPrime.checkIfPrime(3)

        assertEquals(true, answer)
    }
    @Test
    fun `4 is not a prime`(){
        val answer = largestPrime.checkIfPrime(4)

        assertEquals(false, answer)
    }
}