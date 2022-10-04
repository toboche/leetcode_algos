class ReconstructBst {
    // This is an input class. Do not edit.
    open class BST(value: Int, left: BST? = null, right: BST? = null) {
        var value = value
        var left = left
        var right = right
    }

    fun reconstructBst(preOrderTraversalValues: List<Int>): BST? {
        fun visit(list: List<Int>): BST? {
            if (list.isEmpty()) return null

            val first = list.first()
            if (list.size == 1) {
                return BST(first)
            }

            val startOfRight = list.withIndex()
                .firstOrNull { (index, it) ->
                    it >= first && index != 0
                }
                ?.index
                ?: -1
            val right = if (startOfRight != -1) {
                visit(list.subList(startOfRight, list.count()))
            } else {
                null
            }
            val left = if (startOfRight != -1 && startOfRight != 1) {
                visit(list.subList(1, startOfRight))
            } else if (startOfRight == -1 && list.count() > 1) {
                visit(list.subList(1, list.count()))
            } else {
                null
            }

            return BST(first, left, right)
        }


        return visit(preOrderTraversalValues)
    }
}