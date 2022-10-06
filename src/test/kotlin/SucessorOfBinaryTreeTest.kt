import org.junit.Assert.*
import org.junit.Test

class SucessorOfBinaryTreeTest {
    @Test
    fun `test from sample`() {
        val root = SucessorOfBinaryTree.BinaryTree(1)
        root.left = SucessorOfBinaryTree.BinaryTree(2)
        root.left!!.parent = root
        root.right = SucessorOfBinaryTree.BinaryTree(3)
        root.right!!.parent = root
        root.left!!.left = SucessorOfBinaryTree.BinaryTree(4)
        root.left!!.left!!.parent = root.left!!
        root.left!!.right = SucessorOfBinaryTree.BinaryTree(5)
        root.left!!.right!!.parent = root.left!!
        root.left!!.left!!.left = SucessorOfBinaryTree.BinaryTree(6)
        root.left!!.left!!.left!!.parent = root.left!!.left!!
        val node = root.left!!.right!!
        val expected = root

        val actual = SucessorOfBinaryTree().findSuccessor(root, node)

        assertEquals(
            expected,
            actual
        )
    }

}