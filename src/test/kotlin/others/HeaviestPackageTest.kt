package others

import org.junit.Assert.assertEquals
import org.junit.Test

class HeaviestPackageTest {
    @Test
    fun `test 1`() {
        val actual = HeaviestPackage().getHeaviestPackage(arrayOf(2, 9, 10, 3, 7))

        assertEquals(
            21,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = HeaviestPackage().getHeaviestPackage(arrayOf(20,13,8,9))

        assertEquals(
            50,
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = HeaviestPackage().getHeaviestPackage(arrayOf(30,15,5,9))

        assertEquals(
            30,
            actual
        )
    }

    @Test
    fun `test 4`() {
        val actual = HeaviestPackage().getHeaviestPackage(arrayOf(10, 2, 2, 6, 1, 7))

        assertEquals(
            28,
            actual
        )
    }
}