import kotlin.contracts.contract

class OneEditDistance {
    fun isOneEditDistance(s: String, t: String): Boolean {
        var ptr = 0
        while (ptr < s.length || ptr < t.length) {
            if ((ptr == s.length && t.substring(ptr + 1).isEmpty()) ||
                ptr == t.length && s.substring(ptr + 1).isEmpty()
            ) {
                return true
            } else if (ptr == s.length || ptr == t.length) {
                return false
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