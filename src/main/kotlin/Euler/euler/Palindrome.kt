package Euler.euler

class Palindrome {
    fun findLargestPalindrome(numOfDigits: Int): Int {

        val largestNDigitNumber = Math.pow(10.toDouble(), (numOfDigits).toDouble()) - 1
        val largestNumber = Math.pow(largestNDigitNumber, 2.toDouble()).toInt();

        var answer: Int = 0

        var array = largestNumber.toString().map { it.toString().toInt() }
        val length = array.size

        val firstHalfArray = array.subList(0, length / 2)
        var firstHalfNumber = firstHalfArray.joinToString(separator = "") { it -> it.toString() }.toInt()
        println(firstHalfNumber)

        for (i in firstHalfNumber downTo 1) {

            val iArray = i.toString().map { it.toString().toInt() }
            var separator = emptyList<Int>()
            var secondHalfArray = iArray.reversed()

            val palindromeArray = iArray + separator + secondHalfArray
            val palindromeNumber = palindromeArray.joinToString(separator = "") { it -> it.toString() }.toInt()

            if (checkIfDivisable(palindromeNumber, largestNDigitNumber.toInt())) {
                answer = palindromeNumber
                break
            }
        }
        return answer
    }

    fun checkIfDivisable(palindromeNumber: Int, largestDigit: Int): Boolean {
        var x = largestDigit
        println("Here's the palindrome: $palindromeNumber")
        while (palindromeNumber / x < largestDigit) {
            if (palindromeNumber % x == 0) {
                return true
            } else {
                x--
            }
        }
        return false
    }
}