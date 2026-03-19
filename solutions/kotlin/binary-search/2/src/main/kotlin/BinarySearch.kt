object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var low = 0
        var high = list.size - 1

        while (low <= high) {
            val mid = (low + high) ushr 1

            when {
                list[mid] == item -> return mid
                list[mid] < item -> low = mid + 1
                else -> high = mid - 1
            }
        }

        throw NoSuchElementException("Target item $item not found.")
    }
}