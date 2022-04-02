data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
) {


    companion object {
        fun from(list: List<Int?>): TreeNode? {
            if (list.isEmpty()) return null

            val first = list.first() ?: return null

            val current = TreeNode(first)
            current.left = from(list.drop(1))
            current.right = from(list.drop(2))
            return current
        }
    }
}