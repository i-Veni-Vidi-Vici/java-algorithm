package dynamicprogramming._518;

public class Solution {
    public int change(int amount, int[] coins) {
        // dp 배열 초기화: dp[i]는 금액 i를 만들 수 있는 조합의 수
        int[] dp = new int[amount + 1];

        // 금액 0을 만드는 방법은 1가지 (아무 동전도 사용하지 않는 경우)
        dp[0] = 1;

        // 각 동전에 대해
        for (int coin : coins) {
            // 현재 동전부터 목표 금액까지 반복
            for (int i = coin; i <= amount; i++) {
                // 현재 금액에서 현재 동전을 뺀 금액의 조합 수를 더함
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
    // 4ms
}
