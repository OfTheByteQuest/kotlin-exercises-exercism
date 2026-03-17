object EliudsEggs {

    fun eggCount(number: Int): Int{
        var count: Int = 0
        var num: Int = number

        while (num != 0){
            count += num and 1
            num = num ushr 1
        }
        return count
    }
}
