import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayOfProductsTest {
    @Test
    fun `test from sample`() {
        val actual = ArrayOfProducts().arrayOfProducts(mutableListOf(5, 1, 4, 2))

        assertEquals(
            listOf(8, 40, 10, 20),
            actual
        )
    }

}