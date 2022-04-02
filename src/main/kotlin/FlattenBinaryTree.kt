class FlattenBinaryTree {
    fun flatten(root: TreeNode?): Unit {
        if (root == null) {
            return
        }
        flatten(root.left)
        val lastLeft = findLast(root.left)
        flatten(root.right)
        if (lastLeft != null) {
            lastLeft.right = root.right
            root.right = root.left
        }

        root.left = null
    }

    fun findLast(root: TreeNode?): TreeNode? {
        var last = root
        while (last?.right != null) last = last.right
        return last
    }
}