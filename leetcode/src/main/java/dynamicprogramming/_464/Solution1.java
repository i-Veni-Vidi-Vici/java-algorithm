package dynamicprogramming._464;

public class Solution1 {
    private Boolean[] dp;
    private int maxChoosable;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        // 엣지 케이스 처리
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
        if (desiredTotal <= 0) return true;

        maxChoosable = maxChoosableInteger;
        dp = new Boolean[1 << maxChoosableInteger];

        return dfs(0, desiredTotal);
    }

    private boolean dfs(int used, int total) {
        if (dp[used] != null) return dp[used];

        for (int i = 1; i <= maxChoosable; i++) {
            int curr = 1 << (i - 1);
            if ((used & curr) != 0) continue;

            if (total <= i || !dfs(used | curr, total - i)) {
                dp[used] = true;
                return true;
            }
        }

        dp[used] = false;
        return false;
    }
    // 64
}
