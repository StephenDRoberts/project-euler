package Euler.euler;

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MutlipleThreeFiveTest(

) {

    private val multipleThreeFive = MutlipleThreeFive()
    @Test
    fun ` finds the sum of multiples below 10 = 23`() {
        val answer = multipleThreeFive.findSumOfMultiples(10)

        assertEquals(23, answer)
    }

    @Test
    fun ` finds the sum of multiples below 100 = ?`() {
        val answer = multipleThreeFive.findSumOfMultiples(1000)

        assertEquals(233168, answer)
    }
}