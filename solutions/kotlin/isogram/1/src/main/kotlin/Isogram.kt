object Isogram {

    fun isIsogram(input: String): Boolean {
        if (input.isEmpty()) return true
        val strBuild = StringBuilder()
        val redundLetters = listOf('-', ' ')
        var inpChar: Char
        for (char in input){
            inpChar = char.lowercase().single()
            if (inpChar !in redundLetters){
                if (strBuild.indexOf(inpChar.toString()) != -1) return false
                strBuild.append(inpChar)
            }
        }
        return true
    }
}
