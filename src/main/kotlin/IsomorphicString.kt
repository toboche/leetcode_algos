class IsomorphicString {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val mapping = mutableMapOf<Char, Char>()
        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]
            val tCharMapped: Char = if (mapping.containsKey(tChar)) {
                mapping[tChar]!!
            } else if (mapping.containsValue(sChar)) {
                return false
            } else {
                mapping[tChar] = sChar
                sChar
            }
            if (sChar != tCharMapped) {
                return false
            }
        }
        return true
    }
}