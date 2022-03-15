class ValidPalindrome2 {
    fun validPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l] == s[r]) {
                l++
                r--
            } else
                return validPalindromeWithoutSkipping(s.substring(l..r - 1)) || validPalindromeWithoutSkipping(
                    s.substring(
                        l + 1..r
                    )
                )
        }
        return true
    }

    private fun validPalindromeWithoutSkipping(str: String): Boolean {
        for (i in 0 until str.length / 2) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}