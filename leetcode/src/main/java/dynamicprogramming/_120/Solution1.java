package dynamicprogramming._120;

import java.util.*;

public class Solution1 {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 삼각형의 행 개수
        int n = triangle.size();

        // 마지막 행부터 시작하여 위로 올라가면서 DP 배열을 갱신
        int[] dp = new int[n];

        // dp 배열을 마지막 행으로 초기화
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // 아래에서 위로 올라가면서 각 위치의 최소 합을 계산
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 현재 위치의 값과 아래 행의 두 값 중 작은 값을 더함
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        // 맨 위 값이 최소 경로 합
        return dp[0];
    }
    // 2ms
}
