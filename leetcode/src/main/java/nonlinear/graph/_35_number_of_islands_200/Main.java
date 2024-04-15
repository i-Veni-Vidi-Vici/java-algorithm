package nonlinear.graph._35_number_of_islands_200;


public class Main {
    public void dfs(int x, int y, char[][] grid) {
        if (x<0 ||x>= grid.length  ||y<0 || y>= grid[0].length|| grid[x][y] == '0')
            return;

        grid[x][y] = '0';

        dfs(x+1, y, grid);// 남
        dfs(x, y-1, grid); // 서
        dfs(x, y+1, grid); // 동
        dfs(x-1, y, grid); // 북

    }
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i,j,grid);
                    count++;
                }
            }
        }

        return count;
    }
    // 3ms
}
