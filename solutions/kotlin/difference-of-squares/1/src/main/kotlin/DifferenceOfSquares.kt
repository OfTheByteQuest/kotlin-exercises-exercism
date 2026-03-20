import java.math.BigInteger
class Squares (n: Int) {
    val sumOfSq: Int
    val sqOfSum: Int
    
    init {
        require (n >= 0) {
            "Expected: The natural number should be positive.\n Actual: The number received is $n"
        }
        sqOfSum = ((n*n)*(n+1)*(n+1))/4
        sumOfSq = (n*(n+1)*(2*n+1)) / 6
    }
    

    fun sumOfSquares(): Int {
        return sumOfSq
    }

    fun squareOfSum(): Int {
        return sqOfSum
    }

    fun difference(): Int {
        return sqOfSum - sumOfSq
    }
}
