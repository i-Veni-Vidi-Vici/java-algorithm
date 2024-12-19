package dynamicprogramming._1937;

public class Solution1 {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        // dp[j]는 현재 행의 j번째 열을 선택했을 때의 최대 점수
        long[] dp = new long[n];

        // 첫 번째 행 초기화
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }

        // 각 행에 대해 계산
        for (int i = 1; i < m; i++) {
            // 현재 행의 새로운 dp 값을 저장할 배열
            long[] newDp = new long[n];

            // 왼쪽에서 오른쪽으로의 최대값 계산
            long[] leftMax = new long[n];
            leftMax[0] = dp[0];
            for (int j = 1; j < n; j++) {
                leftMax[j] = Math.max(leftMax[j-1] - 1, dp[j]);
            }

            // 오른쪽에서 왼쪽으로의 최대값 계산
            long[] rightMax = new long[n];
            rightMax[n-1] = dp[n-1];
            for (int j = n-2; j >= 0; j--) {
                rightMax[j] = Math.max(rightMax[j+1] - 1, dp[j]);
            }

            // 각 열에 대한 최대값 계산
            for (int j = 0; j < n; j++) {
                newDp[j] = points[i][j] + Math.max(leftMax[j], rightMax[j]);
            }

            dp = newDp;
        }

        // 마지막 행에서의 최대값 찾기
        long result = dp[0];
        for (int j = 1; j < n; j++) {
            result = Math.max(result, dp[j]);
        }

        return result;
    }

    // 9ms
}
