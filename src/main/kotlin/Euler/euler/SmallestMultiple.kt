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