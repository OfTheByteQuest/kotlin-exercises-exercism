object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val modified = mutableMapOf<Char, Int>()
        for ((key, values) in source){
            modified.putAll(
                values.associateBy(
                    keySelector = { it.lowercase().single()},
                    valueTransform = { key}
                )
            )
        }
        return modified
    }
}
