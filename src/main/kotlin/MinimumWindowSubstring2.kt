class MinimumWindowSubstring2 {
    fun minWindow(s: String, t: String): String {
        var l = 0
        var r = -1
        var bestRange = 0 to -1
        var bestLength = Int.MAX_VALUE
        val current = mutableMapOf<Char, Int>()
        t.forEach{ current[it] = (current[it]?:0) + 1}
        while(l<s.length && r<s.length){
            //can be optimised with an additional field
            if(current.values.all{ it <= 0}){
                val len = r - l
                if(len < bestLength){
                    bestLength = len
                    bestRange = l to r
                }
                if(current.keys.contains(s[l])){
                    current[s[l]] = current[s[l]]!! + 1
                }
                l++
            }else{
                r++
                if(r==s.length){break}
                if(current.keys.contains(s[r])){
                    current[s[r]] = current[s[r]]!! - 1
                }
            }
        }
        return s.substring(bestRange.first, bestRange.second+1)
    }
}