import kotlin.contracts.contract

class OneEditDistance {
    fun isOneEditDistance(s: String, t: String): Boolean {
        var ptr = 0
        while (ptr < s.length || ptr < t.length) {
            if ((ptr == s.length && t.substring(ptr).isEmpty()) ||
                ptr == t.length && s.substring(ptr).isEmpty()
            ) {
                return true
            } else if (s[ptr] == t[ptr]) {
                ptr++
                continue
            } else if (s.length == t.length) {
                return s.substring(ptr + 1) == t.substring(ptr + 1)
            } else {
                return s.substring(ptr + 1) == t.substring(ptr) || s.substring(ptr) == t.substring(ptr + 1)
            }
        }
        return false
    }
}