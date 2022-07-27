import org.junit.Assert.*
import org.junit.Test

class WordLadderTest {
    @Test
    fun name() {
        val ladderLength = WordLadder().ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"))

        assertEquals(5, ladderLength)
    }
}