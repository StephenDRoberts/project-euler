package Euler.euler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SumSquareDifferenceTest {
    private val sumSquareDifference = SumSquareDifference()

    @Test
    fun `difference with range of 10 is 2640`(){
        val answer = sumSquareDifference.findDifference(10)

        assertEquals(2640, answer)
    }

    @Test
    fun `difference with range of 100 is ???`(){
        val answer = sumSquareDifference.findDifference(100)

        assertEquals(25164150, answer)
    }

}