package nonlinear.graph.numberofislands200;

public class Main2 {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    // 재귀 또는 스택
                    dfs(i, j, grid);
                }
            }
        }

        return count;
    }

    private void dfs(int x, int y, char[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';

        dfs(x + 1, y, grid);
        dfs(x, y - 1, grid);
        dfs(x , y+1, grid);
        dfs(x - 1, y, grid);
    }

    // 3ms
}
