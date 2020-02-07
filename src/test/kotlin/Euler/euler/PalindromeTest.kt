package Euler.euler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromeTest{
    private val palindrome = Palindrome();

    @Test
    fun `largest Palindrome of 2-digit numbers is 9009`(){
        val answer = palindrome.findLargestPalindrome(2)

        assertEquals(9009, answer)
    }

    @Test
    fun `largest Palindrome of 2-digit numbers is 906609`(){
        val answer = palindrome.findLargestPalindrome(3)

        assertEquals(906609, answer)
    }
}