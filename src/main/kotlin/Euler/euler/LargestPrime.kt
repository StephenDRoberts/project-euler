package Euler.euler

import org.springframework.stereotype.Component

@Component
class LargestPrime {

    fun findLargestPrime(number: Long): Long {
        // val listOfPrimes = mutableListOf(1)

        // var runningEndValue = number
        // var newPossiblePrime = listOfPrimes.last()

        // while(runningEndValue != 1L) {
        //     println(listOfPrimes)
        //     println(runningEndValue)
        //
        //     val lastPrime = listOfPrimes.last()
        //     val increment = if (lastPrime == 2) 1 else 2
        //
        //     newPossiblePrime = Math.max(newPossiblePrime, listOfPrimes.last()) + increment
        //
        //     if (runningEndValue % newPossiblePrime == 0L && checkIfPrime(newPossiblePrime)) {
        //         listOfPrimes.add(newPossiblePrime)
        //         runningEndValue /= newPossiblePrime
        //     }
        // }

        tailrec fun generateListOfPrimes(
            runningEndValue: Long = number,
            primes: List<Long> = listOf(1),
            newPossiblePrime: Long =1L
        ): List<Long> =
            if (runningEndValue != 1L) {
                println(primes)
                println(runningEndValue)

                val lastPrime = primes.last()
                val increment = if (lastPrime == 2L) 1L else 2L

                val newPossiblePrime2 = Math.max(newPossiblePrime, primes.last()) + increment

                if (runningEndValue % newPossiblePrime2 == 0L && checkIfPrime(newPossiblePrime2)) {
                    generateListOfPrimes(
                        runningEndValue / newPossiblePrime2,
                        primes + newPossiblePrime2,
                        newPossiblePrime2
                    )
                } else {
                    primes
                }
            } else {
                // runningEndValue
                primes
            }

        return generateListOfPrimes(number).last()
    }

    fun checkIfPrime(number: Long): Boolean {
        val sequence = (2..(number - 1)).filter { it % 2L != 0L || it == 2L }

        return sequence.all { number % it != 0L }
    }
}