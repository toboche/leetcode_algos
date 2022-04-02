data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
) {


    companion object {
        fun from(list: List<Int?>, position: Int = 0, level: Int = 1): TreeNode? {
            if (list.isEmpty() || list.size < position + 1) return null

            val first = list[position] ?: return null

            val current = TreeNode(first)
            current.left = from(list, position = level * position + 1, level = level + 1)
            current.right = from(list, position = level * position + 2, level = level + 1)
            return current
        }
    }
}