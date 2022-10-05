import org.junit.Assert.assertEquals
import org.junit.Test

class BinaryTreeDiameterTest {
    @Test
    fun `test from sample`() {
        val root = BinaryTreeDiameter.BinaryTree(1)
        root.left = BinaryTreeDiameter.BinaryTree(3)
        root.left!!.left = BinaryTreeDiameter.BinaryTree(7)
        root.left!!.left!!.left = BinaryTreeDiameter.BinaryTree(8)
        root.left!!.left!!.left!!.left = BinaryTreeDiameter.BinaryTree(9)
        root.left!!.right = BinaryTreeDiameter.BinaryTree(4)
        root.left!!.right!!.right = BinaryTreeDiameter.BinaryTree(5)
        root.left!!.right!!.right!!.right = BinaryTreeDiameter.BinaryTree(6)
        root.right = BinaryTreeDiameter.BinaryTree(2)

        val actual = BinaryTreeDiameter().binaryTreeDiameter(
            root
        )

        assertEquals(
            6,
            actual
        )
    }

}