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

    fun flattenFaster(root: TreeNode?): Unit {
        var current = root

        while (current != null) {
            if (current.left != null) {
                val lastRightmost = findLast(current.left)
                lastRightmost!!.right = current.right
                current.right = current.left
                current.left = null
            }
            current = current.right
        }
    }

    private fun findLast(root: TreeNode?): TreeNode? {
        var last = root
        while (last?.right != null) last = last.right
        return last
    }
}