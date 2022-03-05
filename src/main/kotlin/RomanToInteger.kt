import java.util.*

class RomanToInteger {

    val tens = linkedMapOf(
        "IX" to 9,
        "VIII" to 8,
        "VII" to 7,
        "VI" to 6,
        "V" to 5,
        "IV" to 4,
        "III" to 3,
        "II" to 2,
        "I" to 1,
    )

    fun romanToInt(s: String): Int {
       return  mapTens(s, 1, tens).first
    }

    private fun mapTens(input: String, multiplier: Int, range: Map<String, Int>): Pair<Int, String> {
        val keyMatchingInRange = range.keys.find { input.startsWith(it) }
        return if (keyMatchingInRange != null) {
            range[keyMatchingInRange]!! * multiplier to input.removePrefix(keyMatchingInRange)
        } else {
            0 to input
        }
    }
}