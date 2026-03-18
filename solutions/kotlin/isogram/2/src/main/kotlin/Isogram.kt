object Isogram {

    fun isIsogram(input: String): Boolean {
        val seen = mutableSetOf<Char>()

        for (char in input){
            if (!char.isLetter()) continue
            if (!seen.add(char.lowercaseChar())) return false
        }
        return true
    }
}
