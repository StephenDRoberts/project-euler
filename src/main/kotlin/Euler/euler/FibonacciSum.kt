package Euler.euler

import org.springframework.stereotype.Component

@Component
class FibonacciSum {

    fun calculateSumOfEvens(numberLimit: Int): Int{
        val fibNumbers = mutableListOf(1,2)

        while (fibNumbers[fibNumbers.size-1] + fibNumbers[fibNumbers.size-2] < numberLimit) {
            fibNumbers.add(fibNumbers[fibNumbers.size-1] + fibNumbers[fibNumbers.size-2])
        }

        return fibNumbers.filter { it % 2 == 0 }
                         .sum()
    }
}