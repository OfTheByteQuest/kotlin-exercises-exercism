import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

object AffineCipher {

    tailrec private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        
        return gcd(b, a % b)
    }

    private fun areCoprime(a: Int, b: Int): Boolean {
        return gcd(a, b) == 1
    }

    private fun mmi(a: Int, m: Int): Int {
        var m0 = m
        var y = 0
        var x = 1
        var a0 = a

        if (m == 1) return 0

        while (a0 > 1) {
            val q = a0 / m0
            var t = m0

            m0 = a0 % m0
            a0 = t
            t = y

            y = x - q * y
            x = t
        }

        if (x < 0) x += m
        return x
    }


    
    fun encode(input: String, a: Int, b: Int): String {
        
        require( areCoprime(a, 26) ) {
            "Expected: The key 'a' should be coprime with 26.\nActual: The value of a received is $a."
        }

        return input
        .filter { it.isLetterOrDigit() }
        .map { 
            if ( it.isDigit() ) return@map it

            val x = it.lowercaseChar() - 'a'
            
           ( ( ( x * a  + b ) % 26 ) + 97 ).toChar() 
        }
        .joinToString("")
        .chunked(5)
        .joinToString(separator = " ")
    }

    fun decode(input: String, a: Int, b: Int): String {
        require(areCoprime(a, 26) ) {
            "Expected: The key 'a' should be coprime with 26.\nActual: The value of a received is $a."
        }
        val aInv = mmi(a, 26)
        return input
        .filter { it.isLetterOrDigit() }
        .map {
            if ( it.isDigit() ) return@map it

            val y = it.lowercaseChar() - 'a'
            
            ((( aInv * ( y - b ) ) % 26 + 26) % 26 + 97).toChar()
            
        }
        .joinToString("")
    }
}
