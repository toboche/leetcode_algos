import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateBinarySearchTreeTest {
    @Test
    fun test1() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(2, 1, 3)))

        assertTrue(actual)
    }

    @Test
    fun test2() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(5, 1, 4, null, null, 3, 6)))

        assertFalse(actual)
    }

    @Test
    fun `max boundary`() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(2147483647)))

        assertTrue(actual)
    }

    @Test
    fun `min boundary`() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(-2147483648)))

        assertTrue(actual)
    }

    @Test
    fun `two min boundaries`() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(-2147483648, -2147483648)))

        assertFalse(actual)
    }

    @Test
    fun `two max boundaries`() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(2147483647, 2147483647)))

        assertFalse(actual)
    }
}