var ti = TreeNode(5)
var v = ti.`val`

class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?): Boolean {

        fun validate(root: TreeNode?, low: Int, high: Int): Boolean {
            if (root == null) {
                return true
            }

            if (root.left!!.`val` >= low || (root.right!!.`val` <= high)) {
                return false
            }

            return validate(root.right, root.`val`, high) && validate(root.left, low, root.`val`)
        }

        return validate(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }
}