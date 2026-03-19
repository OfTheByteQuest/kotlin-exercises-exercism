import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean = input.toString().sumOf {  it.digitToInt().toDouble().pow(input.toString().length.toDouble()).toInt()
    } == input

}
