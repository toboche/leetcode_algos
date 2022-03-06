class RomanToInteger2 {

    private val allMappings = linkedMapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1,
    )

    fun romanToInt(s: String): Int {
        var str = s
        var value = 0
        while (str.isNotEmpty()) {
            val mapping = allMappings.entries.first { str.startsWith(it.key, false) }
            value += mapping.value
            str = str.removePrefix(mapping.key)
        }
        return value
    }
}