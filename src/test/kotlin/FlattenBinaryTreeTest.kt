import org.junit.Assert.assertEquals
import org.junit.Test

class FlattenBinaryTreeTest {
    @Test
    fun `test null not crashes`() {
        FlattenBinaryTree().flatten(null)
    }

    @Test
    fun `test single item`() {
        val root = TreeNode(1)

        FlattenBinaryTree().flatten(root)

        assertEquals(1, root.`val`)
    }
}