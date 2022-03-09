import java.math.BigInteger

class AddBinary {
    fun addBinary(a: String, b: String): String {
        return intToBinaryString((binaryToInt(a) + binaryToInt(b)))
    }

    private fun intToBinaryString(bigInteger: BigInteger): String {
        return bigInteger.toString(2)
    }

    private fun binaryToInt(str: String): BigInteger {
        return str.withIndex()
            .map { it.value.digitToInt().toBigInteger().shl(str.length - 1 - it.index) }
            .fold(BigInteger.ZERO) { acc, num ->
                acc + num
            }
    }
}