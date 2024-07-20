package linear.array._12_best_time_to_buy_and_sel_lstock_121;

public class Main {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = prices.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;

        while (start <= end) {
            if (min > prices[start]) {
                min = prices[start];

                while (start < end) {
                    if (max < prices[end]) {
                        max = prices[end];

                        if (result < max - min) {
                            result = max - min;
                        }
                    }

                    end--;
                }

                max = Integer.MIN_VALUE;
                end = prices.length - 1;
            }

            start++;
        }

        return result;
    }

    // 293ms
}
