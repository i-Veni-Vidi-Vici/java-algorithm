package dynamicprogramming._72;

public class Solution1 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // dp[i][j]는 word1의 처음 i개 문자를 word2의 처음 j개 문자로
        // 변환하는데 필요한 최소 연산 횟수
        int[][] dp = new int[m + 1][n + 1];

        // 첫 번째 문자열이 비어있는 경우, 모든 문자를 삽입해야 함
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // 두 번째 문자열이 비어있는 경우, 모든 문자를 삭제해야 함
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        // 동적 프로그래밍으로 최소 연산 횟수 계산
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 현재 문자가 같은 경우
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                // 현재 문자가 다른 경우
                else {
                    dp[i][j] = 1 + Math.min(
                            dp[i-1][j-1],  // 교체
                            Math.min(
                                    dp[i-1][j],    // 삭제
                                    dp[i][j-1]     // 삽입
                            )
                    );
                }
            }
        }

        return dp[m][n];
    }
    // 5ms
}
