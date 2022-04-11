import kotlin.math.max
import kotlin.math.min

class WhenToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = Int.MIN_VALUE
        for (price in prices) {
            minPrice = min(minPrice, price)
            val currentProfit = price - minPrice
            maxProfit = max(currentProfit, maxProfit)
        }
        return maxProfit
    }
}