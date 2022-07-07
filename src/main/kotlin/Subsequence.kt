class Subsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        var sPtr = 0
        for (t1 in t) {
            if (t1 == s[sPtr]) {
                sPtr++
            }
            if (sPtr == s.length) {
                return true
            }
        }
        return false
    }
}