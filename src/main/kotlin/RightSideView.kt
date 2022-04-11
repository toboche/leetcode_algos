class RightSideView {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        val currentLevelQueue = mutableListOf(root)
        val nextLevelQueue = mutableListOf<TreeNode>()
        val view = mutableListOf<Int>()
        while (currentLevelQueue.isNotEmpty() || nextLevelQueue.isNotEmpty()) {
            if (currentLevelQueue.isEmpty()) {
                currentLevelQueue.addAll(nextLevelQueue)
                nextLevelQueue.clear()
            }
            val current = currentLevelQueue.removeAt(0)
            if (currentLevelQueue.isEmpty()) {
                view.add(current.`val`)
            }
            current.left?.let { nextLevelQueue.add(it) }
            current.right?.let { nextLevelQueue.add(it) }
        }
        return view
    }
}