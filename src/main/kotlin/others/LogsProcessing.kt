package others

import java.math.BigInteger

class LogsProcessing {
    fun processLogs(logs: Array<String>, threshold: Int): Array<String> {
        val ts = mutableMapOf<String, BigInteger>()

        logs.forEach {
            println(it)
            val (sender, receiver, count) = it.split(' ')

            if (sender != receiver) {
                ts.compute(sender) { _, value -> (value ?: BigInteger.ZERO) + BigInteger.ONE }
                ts.compute(receiver) { _, value -> (value ?: BigInteger.ZERO) + BigInteger.ONE }
            } else {
                ts.compute(sender) { _, value -> (value ?: BigInteger.ZERO) + BigInteger.ONE }
            }
        }
        return ts.filter { it.value >= threshold.toBigInteger() }
            .map { it.key }
            .sortedBy { it.toInt() }
            .toTypedArray()
    }
}