import org.junit.Assert.assertEquals
import org.junit.Test

class RightSideViewTest {
    @Test
    fun `empty node`() {
        val actual = RightSideView().rightSideView(null)

        assertEquals(
            emptyList<Int>(),
            actual
        )
    }

    @Test
    fun `single node`() {
        val actual = RightSideView().rightSideView(TreeNode(1))

        assertEquals(
            listOf(1),
            actual
        )
    }
}