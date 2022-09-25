import org.junit.Test

class ValidateBstTest {
    @Test
    fun TestCase1() {
        val tree = ValidateBst.BST(10)
        tree.left = ValidateBst.BST(5)
        tree.left!!.left = ValidateBst.BST(2)
        tree.left!!.left!!.left = ValidateBst.BST(1)
        tree.left!!.right = ValidateBst.BST(5)
        tree.right = ValidateBst.BST(15)
        tree.right!!.left = ValidateBst.BST(13)
        tree.right!!.left!!.right = ValidateBst.BST(14)
        tree.right!!.right = ValidateBst.BST(22)

        assert(ValidateBst().validateBst(tree))
    }
}