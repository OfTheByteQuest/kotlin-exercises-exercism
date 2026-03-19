object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        return factors
            .filter {it > 0}
            .flatMap { factor -> 
                (factor until limit step factor)
            }
            .toSet()
            .sum()
    }
}
