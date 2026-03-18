data class Year(val year: Int) {
    init{ 
        require( year > 0 ){
            "Expected: Year should be > 0.\n Actual: $year"
        }
    }
    val isLeap: Boolean 
        get() = when {
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
}
