class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    val x = a.toFloat()
    val y = b.toFloat()
    val z = c.toFloat()

    init {
        require( x > 0 && y > 0 && z > 0 && (x + y >= z) && (x + z >= y) && (y + z >= x)){
            "Expected: All sides of the triangle should be real numbers  and strictly greater than zero and follow the inequality property of a triangle.\n Actual: The sides received are: $a, $b, and $c"
        }
    }

    val isEquilateral: Boolean = (x == y) && (x == z)
    val isIsosceles: Boolean = (x == y) || (y == z) || (x == z)
    val isScalene: Boolean = (x != y) && (y != z) && (x != z)
}
