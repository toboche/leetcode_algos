import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    @Test
    fun test1() {
        val actual = ValidPalindrome().isPalindrome("abcba")

        assertTrue(actual)
    }

    @Test
    fun test2() {
        val actual = ValidPalindrome().isPalindrome("ab")

        assertFalse(actual)
    }

    @Test
    fun test3() {
        val actual = ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")

        assertTrue(actual)
    }

    @Test
    fun test4() {
        val actual = ValidPalindrome().isPalindrome("0P")

        assertFalse(actual)
    }
}