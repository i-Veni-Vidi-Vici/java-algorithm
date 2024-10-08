package linear.array._12_best_time_to_buy_and_sel_lstock_121

class Solution3 {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        // 임시로 첫 번째 값을 저점으로 지정
        var minPrice = prices[0]
        // 현재 값을 우측으로 차례대로 이동하면서 계산
        for (price in prices) {
            // 지금까지 저점 계산
            minPrice = minPrice.coerceAtMost(price)
            // 현재 값과 저점의 차이가 최대 이익인 경우 교체
            maxProfit = maxProfit.coerceAtLeast(price - minPrice)
        }
        return maxProfit
    }
}