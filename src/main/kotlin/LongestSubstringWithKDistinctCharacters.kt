import kotlin.math.max

class LongestSubstringWithKDistinctCharacters {
    fun lengthOfLongestSubstringKDistinct(s: String, k: Int): Int {
        if (k == 0 || s.isEmpty()) {
            return 0
        }
        var start = 0
        var end = 0
        var maxLength = 1
        val currentChars = mutableMapOf<Char, Int>()

        while (end < s.length) {
            currentChars[s[end]] = (currentChars[s[end]] ?: 0) + 1
            end++

            while (currentChars.count { it.value > 0 } == k + 1) {
                currentChars[s[start]] = currentChars[s[start]]!! - 1
                start++
            }

            maxLength = max(maxLength, end - start)

        }
        return maxLength
    }
}