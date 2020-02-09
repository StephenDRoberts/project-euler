package Euler.euler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SmallestMultipleTest{
    private val smallestMultiple = SmallestMultiple();

    @Test
    fun `smallest multiple of 1 to 10 is 2520`(){
        val answer = smallestMultiple.findSmallestMultiple(10)

        assertEquals(2520, answer)
    }

    @Test
    fun `smallest multiple of 1 to 20 is ???`(){
        val answer = smallestMultiple.findSmallestMultiple(20)

        assertEquals(232792560, answer)
    }
}