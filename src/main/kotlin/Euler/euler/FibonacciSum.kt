package Euler.euler

import org.springframework.stereotype.Component

@Component
class FibonacciSum {

    fun calculateSumOfEvens(numberLimit: Int): Int{
        // val fibNumbers = mutableListOf(1,2)
        //
        // while (fibNumbers[fibNumbers.size-1] + fibNumbers[fibNumbers.size-2] < numberLimit) {
        //     fibNumbers.add(fibNumbers[fibNumbers.size-1] + fibNumbers[fibNumbers.size-2])
        // }
        //


        return fibSequence().takeWhile { it < numberLimit }.filter { it % 2 == 0 }
                         .sum()
    }

    fun fibSequence(): Sequence<Int> = generateSequence(Pair(0,1)) {
            Pair(it.second, it.first + it.second)
        }.map { it.first }
}