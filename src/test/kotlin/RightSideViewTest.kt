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

    @Test
    fun `symmetrical`() {
        val actual = RightSideView().rightSideView(TreeNode(1, TreeNode(2), TreeNode(3)))

        assertEquals(
            listOf(1, 3),
            actual
        )
    }

    @Test
    fun `asymmetrical tree, two nodes`() {
        val actual = RightSideView().rightSideView(TreeNode(1, null, TreeNode(3)))

        assertEquals(
            listOf(1, 3),
            actual
        )
    }

    @Test
    fun `example from the task`() {
        val actual = RightSideView().rightSideView(TreeNode.from(listOf(1, 2, 3, null, 5, null, 4)))

        assertEquals(
            listOf(1, 3,4),
            actual
        )
    }
}