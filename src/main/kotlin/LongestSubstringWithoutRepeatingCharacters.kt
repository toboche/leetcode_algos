class LongestSubstringWithoutRepeatingCharacters {
    fun solution(s: String): Int {
        if (s.isEmpty()) {
            return 0
        } else if (s.length == 1) {
            return 1
        }
        var l = 0
        var r = 1
        val current = mutableSetOf<Char>()
        current.add(s[l])
        var bestLength = 0
        while (r < s.length && l < s.length) {
            val next = s[r]
            if (current.contains(next)) {
                val last = s[l]
                current.remove(last)
                l++
                continue
            } else {
                current.add(next)
                if (current.size > bestLength) {
                    bestLength = current.size
                }
                r++
            }
        }
        return bestLength
    }
}