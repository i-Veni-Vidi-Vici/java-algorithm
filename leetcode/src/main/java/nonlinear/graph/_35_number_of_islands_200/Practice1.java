package nonlinear.graph._35_number_of_islands_200;

public class Practice1 {

    public boolean dfs(int x, int y, char[][] grid) {
        boolean ch = false;
        if (grid[y][x] == '1') {
            ch = true;
            grid[y][x] = '0';

            if (y - 1 >= 0) {
                dfs(x, y - 1, grid);
            }
            if (y + 1 < grid.length) {
                dfs(x, y + 1, grid);
            }

            if (x - 1 >= 0) {
                dfs(x - 1, y, grid);

            }
            if (x + 1 < grid[y].length) {
                dfs(x + 1, y, grid);
            }
        }

        return ch;
    }

    public int numIslands(char[][] grid) {
        int sum =0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (dfs(x, y, grid)) {
                    sum++;
                }
            }
        }

        return sum;
    }
    // 3~4ms
}
