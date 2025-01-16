package dynamicprogramming._368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> answer = new ArrayList<>();
        if (n == 0) return answer;

        Arrays.sort(nums);

        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 1;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;

                    if (dp[i] > maxLen) {
                        maxLen = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        while (maxIndex != -1) {
            answer.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        return answer;
    }
    // 16ms
}
