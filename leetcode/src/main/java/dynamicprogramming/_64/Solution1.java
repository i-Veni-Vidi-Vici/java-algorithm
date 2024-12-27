package dynamicprogramming._64;

public class Solution1 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;    // 행의 개수
        int n = grid[0].length; // 열의 개수

        // 각 위치까지의 최소 합을 저장할 dp 배열
        // 원본 grid를 직접 수정하여 공간을 절약

        // 첫 번째 행 초기화
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }

        // 첫 번째 열 초기화
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }

        // 나머지 칸들 계산
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        // 오른쪽 하단 값 반환
        return grid[m-1][n-1];
    }

    // 4ms
}
