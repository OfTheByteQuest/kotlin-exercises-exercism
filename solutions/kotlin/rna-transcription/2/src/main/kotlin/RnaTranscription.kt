fun transcribeToRna(dna: String): String {
    require( dna.all { it in "ATCG" } ){ 
        "Expected: DNA string should only contain A, T, C and G characters.\n Actual: The DNA string received is $dna"
    }
    
    return dna.map {
        when (it) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException()
        }
    }.joinToString("")
}