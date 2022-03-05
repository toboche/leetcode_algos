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
        "XC" to 90,
        "LXXX" to 80,
        "LXX" to 70,
        "LX" to 60,
        "L" to 50,
        "XL" to 40,
        "XXX" to 30,
        "XX" to 20,
        "X" to 10,
    )

    private val hundredToNineHundred = linkedMapOf(
        "CM" to 900,
        "DCCC" to 800,
        "DCC" to 700,
        "DC" to 600,
        "D" to 500,
        "CD" to 400,
        "CCC" to 300,
        "CC" to 200,
        "C" to 100,
    )

    private val thousandToThreeThousand = linkedMapOf(
        "MMM" to 3000,
        "MM" to 2000,
        "M" to 1000,
    )

    private val allRanges = listOf(
        thousandToThreeThousand, hundredToNineHundred, tenToNinetyInTens, oneToNine
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