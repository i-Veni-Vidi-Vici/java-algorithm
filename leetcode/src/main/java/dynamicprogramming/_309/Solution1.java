package dynamicprogramming._309;

public class Solution1 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int n = prices.length;

        int[] hold = new int[n];
        int[] notHold = new int[n];
        int[] cooldown = new int[n];

        hold[0] = -prices[0];
        notHold[0] = 0;
        cooldown[0] = 0;

        for (int i = 1; i < n; i++) {
            hold[i] = Math.max(hold[i - 1], notHold[i - 1] - prices[i]);
            notHold[i] = Math.max(notHold[i - 1], cooldown[i - 1]);
            cooldown[i] = hold[i - 1] + prices[i];
        }

        return Math.max(notHold[n - 1], cooldown[n - 1]);
    }
    // 0ms
}
