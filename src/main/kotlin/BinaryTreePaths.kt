class BinaryTreePaths {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return emptyList()
        return pathTo(root).map { it.joinToString("->") }
    }

    private fun pathTo(node: TreeNode): List<List<Int>> {
        if (node.right == null && node.left == null) return listOf(listOf(node.`val`))

        val pathToLeft = if (node.left != null) pathTo(node.left!!).map { listOf(node.`val`) + it }
        else emptyList()

        val pathToRight = if (node.right != null) pathTo(node.right!!).map { listOf(node.`val`) + it }
        else emptyList()

        return pathToLeft + pathToRight

    }
}