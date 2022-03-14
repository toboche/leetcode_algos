class ValidPalindrome2 {
    fun validPalindrome(s: String): Boolean {
        var skipped = false
        var l = 0
        var r = s.length -1
        while(l<r){
            if(skipped && s[l] != s[r]){
                return false
            }
            if(s[l] == s[r]){
                l++
                r--
            } else if(s[l+1] == s[r] && !skipped) {
                l++
                skipped = true
            } else if(s[l] == s[r-1] && !skipped){
                r--
                skipped = true
            } else {
                return false
            }
        }
        return true
    }
}