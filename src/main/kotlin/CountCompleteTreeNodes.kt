class CountCompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        var height = 0
        var node = root
        while (node!!.left != null) {
            height += 1
            node = node.left
        }
        if (height == 0) {
            return 1
        }


        fun exists(idx: Int, d: Int, root: TreeNode): Boolean {
            var left = 0
            var right = (2.toBigInteger().pow(d) - 1.toBigInteger()).toInt()
            var pivot = 0;
            var node: TreeNode? = root
            for (i in 0 until d) {
                pivot = left + (right - left) / 2
                if (idx <= pivot) {
                    node = node!!.left
                    right = pivot
                } else {
                    node = node!!.right
                    left = pivot + 1
                }
            }
            return node != null
        }

        var left = 1
        var right = 2.toBigInteger().pow(height).toInt() - 1

        while (left <= right) {
            val pivot = left + (right - left) / 2
            if (exists(pivot, height, root)) {
                left = pivot + 1
            } else {
                right = pivot - 1
            }
        }


        return (2.toBigInteger().pow(height) - 1.toBigInteger() + left.toBigInteger()).toInt()
    }
}