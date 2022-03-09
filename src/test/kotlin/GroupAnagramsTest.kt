import org.junit.Test
import kotlin.test.assertContentEquals

class GroupAnagramsTest {
    @Test
    fun test1() {
        val actual = GroupAnagrams().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        assertContentEquals(
            listOf(
                listOf("bat"),
                listOf("nat", "tan"),
                listOf("ate", "eat", "tea")
            ),
            actual
        )
    }
}