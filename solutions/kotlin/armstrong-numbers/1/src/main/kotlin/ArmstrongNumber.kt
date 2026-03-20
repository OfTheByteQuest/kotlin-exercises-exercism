import kotlin.math.pow
import kotlin.math.log10
object ArmstrongNumber {

    fun check(input: Int): Boolean {
        if (input < 0) return false
        if (input == 0) return true

        val power = (log10(input.toDouble()).toInt() + 1).toDouble()

        var sum = 0
        var remainder = input

        while( remainder > 0){
            val digit = remainder % 10
            sum += digit.toDouble().pow(power).toInt()
            remainder /= 10
        }

        return sum == input
    }

}
