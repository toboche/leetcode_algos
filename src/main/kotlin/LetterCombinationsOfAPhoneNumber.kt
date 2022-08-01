class LetterCombinationsOfAPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        return digits.toCharArray()
            .map {
                when (it) {
                    '2' -> listOf('a', 'b', 'c')
                    '3' -> listOf('d', 'e', 'f')
                    '4' -> listOf('g', 'h', 'i')
                    '5' -> listOf('j', 'k', 'l')
                    '6' -> listOf('m', 'n', 'o')
                    '7' -> listOf('p', 'q', 'r','s')
                    '8' -> listOf('t', 'u', 'v')
                    '9' -> listOf('w', 'x', 'y', 'z')
                    else -> throw Exception("sth went wrong")
                }
            }
            .fold(listOf("")) { acc, chars ->
                chars.flatMap { char ->
                    acc.map {
                        it + char
                    }
                }
            }
            .let {
                it.filter { it.isNotEmpty() }
            }
    }
}