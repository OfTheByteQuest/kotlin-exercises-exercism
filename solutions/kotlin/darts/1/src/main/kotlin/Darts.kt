import kotlin.math.hypot

object Darts {
    fun score(x: Any, y: Any): Int{ 
        val xCoord = (x as Number).toDouble()
        val yCoord = (y as Number).toDouble()
        val dis = hypot(xCoord, yCoord)
        return when {
            ( dis <= 1.0 ) -> 10
            ( dis <= 5.0 ) -> 5
            ( dis <= 10.0 ) -> 1
            else -> 0
        }
    }
}
