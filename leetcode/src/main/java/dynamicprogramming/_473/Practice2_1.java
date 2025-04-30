package dynamicprogramming._473;

import java.util.*;

public class Practice2_1 {
    public boolean makesquare(int[] matchsticks) {
        Arrays.sort(matchsticks);

        for (int i = 0; i < matchsticks.length / 2; i++) {
            int temp = matchsticks[matchsticks.length - i - 1];
            matchsticks[matchsticks.length - i - 1] = matchsticks[i];
            matchsticks[i] = temp;
        }

        int sum = 0;

        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }
        if (sum % 4 != 0) {
            return false;
        }
        sum /= 4;

        int[] dp = new int[4];

        return dfs(sum, 0, dp, matchsticks);

    }

    private boolean dfs(int sum, int index, int[] dp, int[] matchsticks) {
        if (dp[0] == sum && dp[1] == sum && dp[2] == sum && dp[3] == sum) {
            return true;
        }

        for (int i = 0; i < dp.length; i++) {
            if (matchsticks[index] + dp[i] > sum) {
                continue;
            }
            dp[i] += matchsticks[index];

            if (dfs(sum, index + 1, dp, matchsticks)) {
                return true;
            }
            dp[i] -= matchsticks[index];
            if (dp[i] == 0) {
                return false;
            }

        }

        return false;
    }

    // 5ms
}
