package Euler.euler

class SmallestMultiple {
    private val primes = LargestPrime()
    fun findSmallestMultiple(maxNumber: Int): Int {

        val listOfPrimes = getListOfPrimes(maxNumber)
        var remainderedValues = mutableListOf<Int>()
        var factorOfPrimes = listOfPrimes.reduce { product, next -> product * next }

        for (i in 1..maxNumber) {

            val remainder = factorOfPrimes % i
            if (remainder != 0)
            {
                factorOfPrimes = factorOfPrimes * i/remainder
            }
        }
        return factorOfPrimes
    }

    fun getListOfPrimes(maxNumber: Int): List<Int>{
        var listOfPrimes = mutableListOf<Int>()
        for(i in 2..maxNumber){
            if(primes.checkIfPrime(i.toLong())) listOfPrimes.add(i)
        }
        return listOfPrimes
    }
}





//class Primes {
//
//    fun getListOfPrimes(number: Long): List<Long> {
//        tailrec fun generateListOfPrimes(
//                dividend: Long = number,
//                primes: List<Long> = listOf(1),
//                newPossiblePrime: Long = 1L
//        ): List<Long> =
//                if (dividend >= 2L) {
//                    println(primes)
//                    println(dividend)
//
//                    val lastPrime = primes.last()
//                    val increment = if (lastPrime == 2L) 1L else 2L
//
//                    val divisor = Math.max(newPossiblePrime, primes.last()) + increment
//
//                    if (dividend % divisor == 0L && checkIfPrime(divisor)) {
//                        generateListOfPrimes(
//                                dividend / divisor,
//                                primes + divisor,
//                                divisor
//                        )
//                    } else {
//                        generateListOfPrimes(
//                                dividend, primes, divisor
//                        )
//                    }
//                } else {
//                    primes
//                }
//
//        return generateListOfPrimes(number)
//    }
//
//    fun checkIfPrime(number: Long): Boolean {
//        val sequence = (2..(number - 1)).filter { it % 2L != 0L || it == 2L }
//
//        return sequence.all { number % it != 0L }
//    }
//}