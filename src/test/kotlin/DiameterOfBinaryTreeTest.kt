import org.junit.Assert.*
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
}