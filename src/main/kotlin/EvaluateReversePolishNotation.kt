import java.math.BigInteger

class EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val values = mutableListOf<BigInteger>()
        tokens.forEach {
            when (it) {
                "+" -> values.add(values.removeLast() + values.removeLast())
                "-" ->  {
                    val first = values.removeLast()
                    val second = values.removeLast()
                    values.add(second - first)
                }
                "*" -> values.add(values.removeLast() * values.removeLast())
                "/" -> {
                    val first = values.removeLast()
                    val second = values.removeLast()
                    values.add(second / first)
                }
                else -> values.add(it.toBigInteger())
            }
        }
        return values.first().toInt()
    }

    fun <T> MutableList<T>.removeLast(): T {
        val toReturn = this[size - 1]
        removeAt(size - 1)
        return toReturn
    }
}