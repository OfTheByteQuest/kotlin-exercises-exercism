object Acronym {
    fun generate(phrase: String) : String {
        return phrase
        .split(Regex("[\\s-]+"))
        .filter { it.isNotBlank()}
        .mapNotNull { word -> word.firstOrNull{ it.isLetter()}?.uppercaseChar() }
        .joinToString("")
    }
}
