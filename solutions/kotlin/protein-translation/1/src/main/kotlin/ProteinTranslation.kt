fun translate(rna: String?): List<String> {
    if (rna.isNullOrEmpty()) return emptyList()

    require( rna.all { it in "AUGC"} ) {"Expected: RNA string characters should contain only A, U, G, and C characters for the question.\n Actual: The sequence of RNA received is $rna"}
            
    val proList = mutableListOf<String>()
    
    for (codon in rna.chunked(3)) {
        when (codon) {
            "AUG" -> proList.add("Methionine")
            "UUU", "UUC" -> proList.add("Phenylalanine")
            "UUA", "UUG" -> proList.add("Leucine")
            "UCU", "UCC", "UCA", "UCG" -> proList.add("Serine")
            "UAU", "UAC" -> proList.add("Tyrosine")
            "UGU", "UGC" -> proList.add("Cysteine")
            "UGG" -> proList.add("Tryptophan")
            "UAA", "UAG", "UGA" -> return proList
            else -> throw IllegalArgumentException("Domain Error: Unmapped codon '$codon' encountered.")
        }        
    }
    return proList
}
