class FindAndReplaceInString {
    fun findReplaceString(s: String, indices: IntArray, sources: Array<String>, targets: Array<String>): String {
        val indicesToApply = indices.indices.filter { i ->
            s.length >= indices[i] + sources[i].length &&
                    s.substring(indices[i], indices[i] + sources[i].length) == sources[i]
        }

        val arr = s.map { it.toString() }.toTypedArray()

        indicesToApply.forEach { i ->
            for (repl in indices[i] until indices[i] + sources[i].length) {
                if (repl >= arr.size) break
                arr[repl] = ""
            }
            arr[indices[i]] = targets[i]
        }

        return arr.joinToString("")
    }
}