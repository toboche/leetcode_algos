class MinimumWindowSubstring {
    fun minWindow(s: String, t: String): String {
        var left = 0
        val needed = t.fold(mutableMapOf<Char, Int>()) { acc, char ->
            acc.compute(char) { _, value ->
                (value ?: 0) + 1
            }
            acc
        }
        var contained = mutableMapOf<Char, Int>()
        val windows = mutableListOf<String>()
        for (right in s.indices) {
            val currentRight = s[right]
            contained.compute(currentRight) { _, value ->
                (value ?: 0) + 1
            }
            if (contained.filter { it.value > 0 }.keys.containsAll(needed.keys)) {
                while (left < right && contained[s[left + 1]]!! > 1) {
                    val currentCount = contained[s[left]]!! - 1
                    contained[s[left]] = currentCount
                    left += 1
                }
                windows.add(s.substring(left, right + 1))
                contained[s[left]] = contained[s[left]]!! - 1
                left += 1
            }
        }
        return windows.minByOrNull { it.length } ?: ""
    }
}