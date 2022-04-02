import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class OneEditDistanceTest {
    @Test
    fun test1() {
        val actual = OneEditDistance().isOneEditDistance(s = "ab", t = "acb")

        assertTrue(actual)
    }

    @Test
    fun test2() {
        val actual = OneEditDistance().isOneEditDistance(s = "a", t = "acb")

        assertFalse(actual)
    }

    @Test
    fun test3() {
        val actual = OneEditDistance().isOneEditDistance(s = "a", t = "a")

        assertFalse(actual)
    }

    @Test
    fun test4() {
        val actual = OneEditDistance().isOneEditDistance(s = "a", t = "")

        assertTrue(actual)
    }
}