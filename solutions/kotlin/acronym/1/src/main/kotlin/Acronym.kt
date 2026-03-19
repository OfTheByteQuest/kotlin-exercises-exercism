object Acronym {
    fun generate(phrase: String) : String {
        return phrase
        .filter { it.isLetter() || it == ' ' || it == '-'}
        .split(' ','-')
        .filter { !it.isEmpty() && it != "-"}
        .map { it.first().uppercaseChar() }
        .joinToString("")
    }
}
