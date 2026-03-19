class Dna( val dnaStr: String) {
    init {
        require( dnaStr.all { it in "ACTG"}){
            "Expected: String containing only characters A, T, C, and G.\n Actual sequence is $dnaStr"
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val defaultMap = mapOf('A' to 0, 'T' to 0, 'G' to 0, 'C' to 0)
            val neoMap = dnaStr.groupingBy { it }.eachCount()
            
            return defaultMap + neoMap
        }
}
