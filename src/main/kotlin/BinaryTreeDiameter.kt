class BinaryTreeDiameter {
    // This is an input class. Do not edit.
    open class BinaryTree(value: Int) {
        var value = value
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }

    fun binaryTreeDiameter(tree: BinaryTree?): Int {
        var max = Int.MIN_VALUE
        fun visit(node: BinaryTree?): Int {
            if (node == null) return 0
            val leftHeight = visit(node.left)
            val rightHeight = visit(node.right)
            val localDiameter = leftHeight + rightHeight
            max = Math.max(localDiameter, max)
            return Math.max(leftHeight, rightHeight) + 1
        }
        visit(tree)
        return max
    }
}