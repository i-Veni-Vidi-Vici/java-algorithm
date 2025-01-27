package dynamicprogramming._474;

public class Solution1 {
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j]: i개의 0과 j개의 1을 사용해서 만들 수 있는 최대 부분집합의 크기
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            // 현재 문자열의 0과 1의 개수를 계산
            int zeros = 0, ones = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }

            // dp 배열 갱신
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }

        return dp[m][n];
    }
    // 17ms
}
