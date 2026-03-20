class Clock(hr: Int, min: Int) {
    
    private var totalMinutes: Int

    init {
        totalMinutes = normalize(hr * 60 + min)
    }

    private fun normalize(rawMinutes: Int): Int {
        return ((rawMinutes % 1440) + 1440) % 1440
    }
    
    fun add(minutes: Int) {
        totalMinutes = normalize(totalMinutes + minutes)
    }
    
    fun subtract(minutes: Int) {
        totalMinutes = normalize(totalMinutes - minutes)
    }
    
    override fun toString(): String {
        return String.format("%02d:%02d", totalMinutes / 60, totalMinutes % 60)
    }
   
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clock) return false
    
        return totalMinutes == other.totalMinutes
    }

    override fun hashCode(): Int = totalMinutes
}
