import org.junit.Test
import kotlin.test.assertEquals

class TreeNodeTest {
    @Test
    fun `null input`() {
        val actual = TreeNode.from(listOf(null))

        assertEquals(null, actual)
    }

    @Test
    fun `single item`() {
        val actual = TreeNode.from(listOf(1))

        assertEquals(TreeNode(1), actual)
    }

    @Test
    fun `two items`() {
        val actual = TreeNode.from(listOf(1,2))

        assertEquals(TreeNode(1, TreeNode(2)), actual)
    }
}