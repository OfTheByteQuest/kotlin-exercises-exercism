data class Year(val year: Int) {
    val isLeap: Boolean = when {
        year < 0 -> throw IllegalArgumentException("Expected: Year should be > 0./n Actual: $year")
        year % 400 == 0 -> true
        year % 100 == 0 -> false
        year % 4 == 0 -> true
        else -> false
    }
}
