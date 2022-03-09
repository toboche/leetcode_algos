class GroupAnagrams {

    val charsRange = 'a'..'z'

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashes = mutableMapOf<List<Int>, List<String>>()
        strs.forEach { str ->
            val hash = charsRange.map { char -> str.count { it == char } }
            hashes.compute(hash) { _, value ->
                (value ?: emptyList()) + str
            }
        }
        return hashes.values.toList()
    }
}