class CopyRandomList {
    class Node(var `val`: Int) {
        var next: Node? = null
        var random: Node? = null
    }

    fun copyRandomList(node: Node?): Node? {
        val visited = mutableMapOf<Node, Node>() //original, copy

        fun copy(node: Node?): Node? {
            if (node == null) {
                return null
            }
            if (visited.containsKey(node)) {
                return visited[node]!!
            }
            val newNode = Node(node.`val`)
            visited[node] = newNode
            newNode.next = copy(newNode.next)
            newNode.random = copy(newNode.random)
            return newNode
        }
        return copy(node)
    }
}