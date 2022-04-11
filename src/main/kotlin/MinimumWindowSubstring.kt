class MinimumWindowSubstring {
    fun minWindow(s: String, t: String): String {
        var left = 0
        val needed = t.toSet()
        var current = ""
        var contained = mutableSetOf<Char>()
        val windows = mutableListOf<String>()
        for (right in s.indices) {
            contained.add(s[right])
            if (contained.containsAll(needed)) {
                while (true) {
                    if (s.substring(left + 1, right + 1).toSet().containsAll(needed)) {
                        left += 1
                    } else {
                        break
                    }
                }
                windows.add(s.substring(left, right + 1))
            }
        }
        return windows.minByOrNull { it.length } ?: ""
    }
}