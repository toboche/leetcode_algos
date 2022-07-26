class DiameterOfBinaryTree {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var maxDiameter = 0
        fun longestPath(node: TreeNode?): Int {
            if(node == null) return 0

            val leftPath = longestPath(node.left)
            val rightPath = longestPath(node.right)

            maxDiameter = Math.max(leftPath+rightPath, maxDiameter)

            return Math.max(leftPath, rightPath) + 1
        }
        longestPath(root)
        return maxDiameter
    }
}