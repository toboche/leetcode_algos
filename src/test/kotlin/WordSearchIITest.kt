import org.junit.Assert.assertEquals
import org.junit.Test

class WordSearchIITest {
    @Test
    fun `test 1`() {
//        Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
//        Output: ["eat","oath"]
        val actual = WordSearchII().findWords(
            arrayOf(
                charArrayOf('o', 'a', 'a', 'n'),
                charArrayOf('e', 't', 'a', 'e'),
                charArrayOf('i', 'h', 'k', 'r'),
                charArrayOf('i', 'f', 'l', 'v'),
            ),
            arrayOf("oath", "pea", "eat", "rain")
        )

        assertEquals(
            listOf("eat", "oath"),
            actual
        )
    }

    @Test
    fun `test dummy`() {
        val actual = WordSearchII().findWords(
            arrayOf(
                charArrayOf('o'),
            ),
            arrayOf("o")
        )

        assertEquals(
            listOf("o"),
            actual
        )
    }

    @Test
    fun `test dummy 2`() {
        val actual = WordSearchII().findWords(
            arrayOf(
                charArrayOf('o', 'a'),
                charArrayOf('r', 'g'),
            ),
            arrayOf("oa")
        )

        assertEquals(
            listOf("oa"),
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = WordSearchII().findWords(
            arrayOf(
                charArrayOf('a'),
                charArrayOf('a'),
            ),
            arrayOf("aaa")
        )

        assertEquals(
            emptyList<String>(),
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = WordSearchII().findWords(
            arrayOf(
                charArrayOf('z'),
                charArrayOf('z'),
            ),
            arrayOf("zzz")
        )

        assertEquals(
            emptyList<String>(),
            actual
        )
    }
}