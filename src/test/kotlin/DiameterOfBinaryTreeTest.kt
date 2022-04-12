import org.junit.Assert.assertEquals
import org.junit.Test

class DiameterOfBinaryTreeTest {
    @Test
    fun `sample 1`() {
        val actual = DiameterOfBinaryTree().diameterOfBinaryTree(TreeNode.from(listOf(1, 2, 3, 4, 5)))

        assertEquals(
            3,
            actual
        )
    }

    @Test
    fun `sample 2`() {
        val actual = DiameterOfBinaryTree().diameterOfBinaryTree(TreeNode.from(listOf(1, 2)))

        assertEquals(
            1,
            actual
        )
    }

    @Test
    fun `sample 3`() {
        val actual = DiameterOfBinaryTree().diameterOfBinaryTree(TreeNode.from(listOf(1)))

        assertEquals(
            0,
            actual
        )
    }
}