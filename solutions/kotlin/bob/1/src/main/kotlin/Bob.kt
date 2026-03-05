object Bob {
    fun hey(input: String): String {
        val trimmedInput = input.trim()
        val hasLetters = trimmedInput.any { it.isLetter() }
        val isYelled = hasLetters  && trimmedInput.none {
            it.isLowerCase()
        }

        return when {
            trimmedInput.isEmpty() -> "Fine. Be that way!"
            isYelled && trimmedInput.endsWith("?") -> "Calm down, I know what I'm doing!"
            trimmedInput.endsWith("?") -> "Sure."
            isYelled -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}