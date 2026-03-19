object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        return searchRecursive(list, item, 0, list.size - 1)
    }

    private tailrec fun searchRecursive(
        list: List<Int>,
        item: Int,
        low: Int,
        high: Int): Int {
        if (low > high) throw NoSuchElementException("Target $item not found.")
    
        val mid = (low + high) ushr 1
    
        return when {
            list[mid] == item -> mid
            list[mid] < item -> searchRecursive(list, item, mid + 1, high)
            else -> searchRecursive(list, item, low, mid - 1)
        }
    }
}