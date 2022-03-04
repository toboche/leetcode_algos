class StringToInteger {
    val digits = setOf(
        '0',
        '1',
        '2',
        '3',
        '4',
        '5',
        '6',
        '7',
        '8',
        '9',
    )

    fun myAtoi(s: String): Int {
        val trimmed = s.trim()
        if (trimmed.isEmpty()) {
            return 0
        }
        val first = trimmed.first()
        val sign = if (first == '-') {
            -1
        } else {
            1
        }
        val signRemoved = if(first == '-'||first =='+') trimmed.drop(1) else trimmed
        val num = signRemoved.dropWhile {
            it == '0'
        }
            .takeWhile { digits.contains(it) }
        if (num.isEmpty()) {
            return 0
        }
        val number = num.toBigInteger() * sign.toBigInteger()
        return if (number > Int.MAX_VALUE.toBigInteger()) {
            Int.MAX_VALUE
        } else if (number < Int.MIN_VALUE.toBigInteger()) {
            Int.MIN_VALUE
        } else {
            number.toInt()
        }
    }
}