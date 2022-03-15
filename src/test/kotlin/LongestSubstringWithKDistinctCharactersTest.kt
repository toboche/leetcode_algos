import org.junit.Assert.assertEquals
import org.junit.Test

class LongestSubstringWithKDistinctCharactersTest {
    @Test
    fun test1() {
        val actual =
            LongestSubstringWithKDistinctCharacters().lengthOfLongestSubstringKDistinct("eceba", 2)

        assertEquals(3, actual)
    }

    @Test
    fun test2() {
        val actual =
            LongestSubstringWithKDistinctCharacters().lengthOfLongestSubstringKDistinct("aa", 1)

        assertEquals(2, actual)
    }

    @Test
    fun test3() {
        val actual =
            LongestSubstringWithKDistinctCharacters().lengthOfLongestSubstringKDistinct("ab", 1)

        assertEquals(1, actual)
    }

    @Test
    fun test4() {
        val actual =
            LongestSubstringWithKDistinctCharacters().lengthOfLongestSubstringKDistinct("aba", 1)

        assertEquals(1, actual)
    }
}