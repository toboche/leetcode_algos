var ti = TreeNode(5)
var v = ti.`val`

//2 -> validate(2,min, max)
//1 -> validate(1, 2, max)
//3 -> validate(3, min, 2)

class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        fun validate(node: TreeNode, min: Long, max: Long): Boolean {
            val thisOk = node.`val` > min && node.`val` < max
            val leftOk = node.left?.let { left ->
                validate(left, min, node.`val`.toLong())
            } ?: true

            val rightOk = node.right?.let { right ->
                validate(right, node.`val`.toLong(), max)
            } ?: true
            return thisOk && leftOk && rightOk
        }

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
}