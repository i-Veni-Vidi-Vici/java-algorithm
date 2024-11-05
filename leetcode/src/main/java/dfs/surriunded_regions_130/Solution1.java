package dfs.surriunded_regions_130;

public class Solution1 {

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        // 첫째 행과 마지막 행 확인
        for (int j = 0; j < n; j++) {
            dfs(board, 0, j);        // 첫째 행
            dfs(board, m - 1, j);      // 마지막 행
        }

        // 첫째 열과 마지막 열 확인
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);        // 첫째 열
            dfs(board, i, n - 1);      // 마지막 열
        }

        // 보드 전체를 순회하며 최종 변환
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';  // 둘러싸인 O를 X로 변환
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';  // 임시 표시했던 T를 다시 O로 변환
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        // 경계 검사와 O가 아닌 경우 처리
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        // 현재 O를 T로 표시
        board[i][j] = 'T';

        // 상하좌우 탐색
        dfs(board, i + 1, j);  // 아래
        dfs(board, i - 1, j);  // 위
        dfs(board, i, j + 1);  // 오른쪽
        dfs(board, i, j - 1);  // 왼쪽
    }
    // 1ms
}
