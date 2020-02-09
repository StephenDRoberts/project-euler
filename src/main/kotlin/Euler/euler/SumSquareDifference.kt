package Euler.euler

class SumSquareDifference {

    fun findDifference(range: Int): Int{
        val sumOfSquares = findSumOfSquares(range)
        val squareOfSum = findSquareOfSum(range)

        return squareOfSum - sumOfSquares
    }

    fun findSumOfSquares(range: Int): Int{
        var array = mutableListOf<Int>()
        for(i in 1..range) array.add(i)
        return array.reduce{prev, next -> prev + Math.pow(next.toDouble(), 2.toDouble()).toInt()}
    }

    fun findSquareOfSum(range: Int): Int{
        var sum = 0
        for(i in 1..range) sum +=i
        return Math.pow(sum.toDouble(), 2.toDouble()).toInt()
    }
}