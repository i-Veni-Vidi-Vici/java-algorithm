package dynamicprogramming._62;

public class Solution1 {
    public int uniquePaths(int m, int n) {
        // dp 배열 생성
        int[][] dp = new int[m][n];

        // 첫 번째 행은 모두 1로 초기화 (오른쪽으로만 이동 가능)
        for(int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // 첫 번째 열은 모두 1로 초기화 (아래로만 이동 가능)
        for(int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // 나머지 칸들을 채워나감
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        // 목표 지점까지의 경로 수 반환
        return dp[m-1][n-1];
    }
    // 0ms
}
