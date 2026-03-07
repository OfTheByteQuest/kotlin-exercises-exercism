import kotlin.math.hypot

object Darts {
    fun score(x: Number, y: Number): Int{ 
        val xCoord = x.toDouble()
        val yCoord = y.toDouble()
        val dis = hypot(xCoord, yCoord)
        return when {
            ( dis <= 1.0 ) -> 10
            ( dis <= 5.0 ) -> 5
            ( dis <= 10.0 ) -> 1
            else -> 0
        }
    }
}
