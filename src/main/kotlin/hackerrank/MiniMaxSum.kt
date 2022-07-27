package hackerrank

import java.math.BigDecimal
import java.math.BigInteger

class MiniMaxSum {
    /*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

    fun miniMaxSum(arr: Array<Int>): Unit {
        val sum = arr.fold(BigInteger.ZERO) { acc, it ->
            acc + it.toBigInteger()
        }
        val min = arr.minOrNull()!!.toBigInteger()
        val max = arr.maxOrNull()!!.toBigInteger()
        println("${sum - max} ${sum - min}")
    }

    fun main(args: Array<String>) {

        val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        miniMaxSum(arr)
    }
}