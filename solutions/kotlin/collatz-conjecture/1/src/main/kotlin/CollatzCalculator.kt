object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Collatz sequence is strict;y defined for positive integers." }
        
        var result = start
        var count: Int = 0
        while (result != 1){
            count++
            if (result % 2 == 0) result /= 2
            else result = result * 3 + 1
        }
        return count
    }
}
