class CourseScheduleII {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val visited = BooleanArray(numCourses)
        val tmp = BooleanArray(numCourses)
        val order = mutableListOf<Int>()

        val graph = Array<MutableList<Int>>(numCourses) { mutableListOf() }
        prerequisites.forEach { (cur, pre) ->
            graph[cur].add(pre)
        }

        fun visit(cur: Int): Boolean {
            if (visited[cur]) {
                return true
            }
            if (tmp[cur]) {
                return false
            }

            tmp[cur] = true

            val toRet = graph[cur].fold(true) { acc, it ->
                acc && visit(it)
            }
            visited[cur] = true
            tmp[cur] = false
            order.add(cur)
            return toRet
        }

        while (visited.contains(false)) {
            val first = visited.withIndex().find { !it.value }!!
            if (!visit(first.index)) {
                return intArrayOf()
            }
        }

        return order.toIntArray()

    }
}