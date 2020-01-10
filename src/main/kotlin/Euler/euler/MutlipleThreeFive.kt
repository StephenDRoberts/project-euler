package Euler.euler

import org.springframework.stereotype.Component

@Component
class MutlipleThreeFive {

    fun findSumOfMultiples(number: Int): Int {
        return (1..number-1).filter { it % 3 ==0 || it % 5 ==0 }
                            .sum()
    }
}