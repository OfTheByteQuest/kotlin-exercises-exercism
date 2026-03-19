object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val uniqueNumSet = mutableSetOf<Int>()
        factors
            .filter {it > 0}
            .forEach { factor -> 
                for (multiple in factor until limit step factor) {
                    uniqueNumSet.add(multiple)
                }
            }
        return uniqueNumSet.sum()
    }
}
