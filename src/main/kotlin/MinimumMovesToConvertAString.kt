class MinimumMovesToConvertAString {
    fun minimumMoves(s: String): Int {
        var cnt = 0
        var total = 0
        for (i in s.indices) {
            if (cnt > 0) cnt--
            if (cnt == 0 && s[i] == 'X') {
                cnt = 3
                total += 1
            }
        }
        return total
    }
}