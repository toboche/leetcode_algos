class InvertBinaryTree {
    open class BinaryTree(value: Int) {
        var value = value
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }

    fun invertBinaryTree(tree: BinaryTree?) {
        fun visit(tree: BinaryTree?): BinaryTree? {
            if (tree == null) return null
            val tmp = tree.left
            tree.left = visit(tree.right)
            tree.right = visit(tmp)
            return tree
        }
        visit(tree)
    }
}