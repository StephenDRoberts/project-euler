package Euler.euler

import org.springframework.stereotype.Component

@Component
class LargestPrime {

    fun findLargestPrime(number: Long): Long {
        val listOfPrimes = mutableListOf(1)

        var runningEndValue = number
        var newPossiblePrime = listOfPrimes.last()

        while (runningEndValue != 1L && runningEndValue != listOfPrimes.last().toLong()) {
            println(listOfPrimes)
            println(runningEndValue)

            val lastPrime = listOfPrimes.last()
            val increment = if (lastPrime <= 2) 1 else 2

            newPossiblePrime = Math.max(newPossiblePrime, listOfPrimes.last()) + increment

            if (runningEndValue % newPossiblePrime == 0L && checkIfPrime(newPossiblePrime.toLong())) {
                listOfPrimes.add(newPossiblePrime)
                runningEndValue /= newPossiblePrime
            }
        }
        return listOfPrimes.last().toLong()
    }

//        tailrec fun generateListOfPrimes(
//            dividend: Long = number,
//            primes: List<Long> = listOf(1),
//            newPossiblePrime: Long = 1L
//        ): List<Long> =
//            if (dividend >= 2L) {
//                println(primes)
//                println(dividend)
//
//                val lastPrime = primes.last()
//                val increment = if (lastPrime <= 2L) 1L else 2L
//
//                val divisor = Math.max(newPossiblePrime, primes.last()) + increment
//
//                if (dividend % divisor == 0L && checkIfPrime(divisor)) {
//                    generateListOfPrimes(
//                        dividend / divisor,
//                        primes + divisor,
//                        divisor
//                    )
//                } else {
//                    generateListOfPrimes(
//                        dividend, primes, divisor
//                    )
//                }
//            } else {
//                primes
//            }
//
//        return generateListOfPrimes(number).last()
//    }
//

        fun checkIfPrime(number: Long): Boolean {
        val sequence = (2..(number - 1)).filter { it % 2L != 0L || it == 2L }

        return sequence.all { number % it != 0L }
    }

}