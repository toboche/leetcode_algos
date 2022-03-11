class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val str = s.toLowerCase().filter { it in 'a'..'z' || it in '0'..'9' }
        for (i in 0 until str.length / 2) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}