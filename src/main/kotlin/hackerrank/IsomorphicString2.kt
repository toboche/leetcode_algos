package hackerrank

class IsomorphicString2 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>() //s char -> t char
        val mapped = mutableSetOf<Char>()
        if(s.length != t.length){
            return false
        }
        for(i in s.indices){
            val ss = s[i]
            val tt = t[i]
            if(map[ss] == tt){
                continue
            }
            if(map[ss] == null && !mapped.contains(tt)){
                map[ss] = tt
                mapped.add(tt)
            }else {
                return false
            }
        }
        return true
    }
}