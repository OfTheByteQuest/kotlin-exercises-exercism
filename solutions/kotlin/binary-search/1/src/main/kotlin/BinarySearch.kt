object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        val idx = list.binarySearch(item)
        if (idx >= 0) return idx else throw NoSuchElementException()
    }
}