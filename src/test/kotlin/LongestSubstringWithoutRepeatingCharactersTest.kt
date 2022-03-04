import org.junit.Assert.*
import org.junit.Test

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    fun test1() {
        val actual = LongestSubstringWithoutRepeatingCharacters().solution("abcabcbb")
        assertEquals(3, actual)
    }

    @Test
    fun test2() {
        val actual = LongestSubstringWithoutRepeatingCharacters().solution("bbbbb")
        assertEquals(1, actual)
    }

    @Test
    fun test3() {
        val actual = LongestSubstringWithoutRepeatingCharacters().solution("pwwkew")
        assertEquals(3, actual)
    }

    @Test
    fun testSingleChar() {
        val actual = LongestSubstringWithoutRepeatingCharacters().solution("a")
        assertEquals(1, actual)
    }
}