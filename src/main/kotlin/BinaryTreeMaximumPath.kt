import kotlin.math.max

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinaryTreeMaximumPath {
    fun maxPathSum(root: TreeNode?): Int {
        var currentMax = Int.MIN_VALUE

        fun rec(node: TreeNode?): Int {
            if(node == null){
                return 0
            }
            val thisValue = node.`val`
            val left = max(rec(node.left), 0)
            val right = max(rec(node.right), 0)
            val max = left + right + thisValue
            currentMax = max(currentMax, max)
            return max(left + thisValue, right + thisValue)
        }
        rec(root)
        return currentMax.toInt()
    }
}