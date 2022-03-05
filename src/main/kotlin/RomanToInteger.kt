class RomanToInteger {

    private val oneToNine = linkedMapOf(
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

    private val tenToNinetyInTens = linkedMapOf(
        "X" to 10,
        "XX" to 20,
        "XXX" to 30,
        "XL" to 40,
        "L" to 50,
        "LX" to 60,
        "LXX" to 70,
        "LXXX" to 80,
        "XC" to 90
    )

    private val allRanges = listOf(
        tenToNinetyInTens,
        oneToNine
    )

    fun romanToInt(s: String): Int {
        return allRanges.fold((0 to s)) { acc, range ->
            val mapped = mapToRange(acc.second, range)
            acc.first + mapped.first to mapped.second
        }.first
    }

    private fun mapToRange(input: String, range: Map<String, Int>): Pair<Int, String> {
        val keyMatchingInRange = range.keys.find { input.startsWith(it) }
        return if (keyMatchingInRange != null) {
            range[keyMatchingInRange]!! to input.removePrefix(keyMatchingInRange)
        } else {
            0 to input
        }
    }
}