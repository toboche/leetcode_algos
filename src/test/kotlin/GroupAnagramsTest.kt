import org.junit.Test
import kotlin.test.assertContentEquals

class GroupAnagramsTest {
    @Test
    fun test1() {
        val actual = GroupAnagrams().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        assertContentEquals(
            listOf(
                listOf("eat", "tea", "ate"),
                listOf("tan", "nat"),
                listOf("bat"),
            ),
            actual
        )
    }

    @Test
    fun testEmpty() {
        val actual = GroupAnagrams().groupAnagrams(arrayOf())

        assertContentEquals(
            emptyList(),
            actual
        )
    }

    @Test
    fun testSingleItem() {
        val actual = GroupAnagrams().groupAnagrams(arrayOf("a"))

        assertContentEquals(
            listOf(listOf("a")),
            actual
        )
    }
}