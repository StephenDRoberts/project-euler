package Euler.euler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FibonacciSumTest {
    private val fibonacciSum = FibonacciSum()

    @Test
    fun `Sum of even Fib numbers below 10 = 10`() {
        val sum = fibonacciSum.calculateSumOfEvens(10)

        assertEquals(10, sum)
    }

    @Test
    fun `Sum of even Fib numbers below 4,000,000 = ???`() {
        val sum = fibonacciSum.calculateSumOfEvens(4_000_000)

        assertEquals(4613732, sum)
    }
}
