import org.junit.Assert.assertEquals
import org.junit.Test

class CountCommonWordsWithOneOccurenceTest {
    @Test
    fun `test 1`() {
        val actual = CountCommonWordsWithOneOccurence().countWords(
            arrayOf("leetcode", "is", "amazing", "as", "is"), words2 = arrayOf("amazing", "leetcode", "is")
        )
        assertEquals(
            2,
            actual
        )
    }

}