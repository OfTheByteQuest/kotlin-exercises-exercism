object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows == 0) return emptyList<List<Int>>()
        
        val pascalList = mutableListOf<List<Int>>()
        for (i in 0 until rows) {
            val rowList = mutableListOf<Int>(1)
            
            for (j in 1..i) {
                rowList.add( rowList[j-1]*(i - j + 1) / j )
            }
            pascalList.add(rowList)
        }
        return pascalList
    }
}
