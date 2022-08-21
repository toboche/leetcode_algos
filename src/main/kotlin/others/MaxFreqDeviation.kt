package others

import java.lang.Long.max

class MaxFreqDeviation {
    fun getMaxFreqDeviation(s: String): Int {
        val current = mutableMapOf<Char, Long>()
        var max = 0L
        for (i in s.indices) {
            current.clear()
            for (j in i until s.length) {
                current[s[j]] = (current[s[j]] ?: 0) + 1
                val cur = (current.values.maxOrNull() ?: 0).toLong() - (current.values.minOrNull() ?: 0).toLong()
                max = max(max, cur)
            }
        }
        return max.toInt()
    }
}