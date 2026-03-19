fun transcribeToRna(dna: String): String {
    if( dna.isEmpty()) return ""
    require( dna.all { it in "ATCG" } ){ 
        "Expected: DNA string should only contain A, T, C and G characters.\n Actual: The DNA string received is $dna"
    }
    
    val rna = StringBuilder()
    dna.forEach {
        when (it) {
            'G' -> rna.append('C')
            'C' -> rna.append('G')
            'T' -> rna.append('A')
            'A' -> rna.append('U')
        }
    }

    return rna.toString()
}