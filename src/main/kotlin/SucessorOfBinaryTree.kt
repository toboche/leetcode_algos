class SucessorOfBinaryTree {

    // This is an input class. Do not edit.
    open class BinaryTree(value: Int) {
        var value = value
        var left: BinaryTree? = null
        var right: BinaryTree? = null
        var parent: BinaryTree? = null
    }

    private fun leftmostChild(node: BinaryTree): BinaryTree {
        return if (node.left != null) leftmostChild(node.left!!)
        else node
    }

    private fun firstLeftParent(node: BinaryTree): BinaryTree? {
        var n: BinaryTree? = node
        while (n != null) {
            if (n.parent?.left == n) {
                return n.parent
            } else {
                n = n?.parent ?: null
            }
        }
        return null
    }

    fun findSuccessor(tree: BinaryTree, node: BinaryTree): BinaryTree? {
        return if (node.right != null) leftmostChild(node.right!!)
        else firstLeftParent(node)
    }

}