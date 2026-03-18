import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number in 1..64){
            "Expected: Square position between and 64.\n Actual: $number"
        }

        return BigInteger.ONE shl (number -1)
    }

    fun getTotalGrainCount(): BigInteger {
        return (BigInteger.ONE shl 64) - BigInteger.ONE
    }
}
