import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertFalse

class ValidPalindrome2Test {
    @Test
    fun test1() {
        val actual = ValidPalindrome2().validPalindrome("aba")

        assertTrue(actual)
    }

    @Test
    fun test5() {
        val actual = ValidPalindrome2().validPalindrome("acbba")

        assertTrue(actual)
    }

    @Test
    fun test6() {
        val actual = ValidPalindrome2().validPalindrome("abbca")

        assertTrue(actual)
    }

    @Test
    fun test2() {
        val actual = ValidPalindrome2().validPalindrome("abca")

        assertTrue(actual)
    }

    @Test
    fun test3() {
        val actual = ValidPalindrome2().validPalindrome("abc")

        assertFalse(actual)
    }

    @Test
    fun test7() {
        val actual = ValidPalindrome2().validPalindrome("deee")

        assertTrue(actual)
    }

    @Test
    fun test4() {
        val actual =
            ValidPalindrome2().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")

        assertTrue(actual)
    }

    @Test
    fun test8() {
        val actual = ValidPalindrome2().validPalindrome("ebcbbececabbacecbbcbe")

        assertTrue(actual)
    }
}