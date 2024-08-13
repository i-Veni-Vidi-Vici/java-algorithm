package nonlinear.graph._35_number_of_islands_200;

public class Practice2 {
    public static int numIslands(char[][] grid) {

        int result =0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == '1') {
                    grid[y][x] = '0';
                    result++;
                    check(grid, x, y);
                }
            }
        }

        return result;
    }

    private static void check(char[][] grid, int x, int y) {

        if (y +1< grid.length && grid[y + 1][x] == '1') {
            grid[y + 1][x] = '0';
            check(grid, x, y + 1);
        }
        if (y -1>= 0 && grid[y -1][x] == '1') {
            grid[y -1][x] = '0';
            check(grid, x, y-1);
        }
        if (x+1< grid[y].length && grid[y ][x+1] == '1') {
            grid[y ][x+1] = '0';
            check(grid, x+1, y);
        }
        if (x-1 >=0 && grid[y ][x-1] == '1') {
            grid[y ][x-1] = '0';
            check(grid, x-1, y );
        }
    }

    public static void main(String[] args) {
        numIslands(new char[][]{{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}});
    }

    // 2ms
}
