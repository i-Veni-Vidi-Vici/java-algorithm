package sort._74_search_a_2d_matrix_2_240;

public class Main1 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int maxY = matrix.length-1;
        int maxX = matrix[maxY].length-1;

        for (int y = 0; y < matrix.length; y++) {
            if (matrix[y][0] > target) {
                if (y == 0) {
                    return false;
                }
                maxY = y - 1;
                break;
            }
            if (matrix[y][0] == target) {
                return true;
            }
        }

        for (int x = 0; x < matrix[maxY].length; x++) {
            if (matrix[0][x] > target) {
                maxX = x - 1;
                break;
            }
            if (matrix[0][x] == target) {
                return true;
            }
        }

        for (int y = 0; y <= maxY; y++) {
            int left = 0;
            int right = maxX;
            while (left <= right) {
                int mid = (left + right) >>> 1;

                if (matrix[y][mid] == target) {
                    return true;
                }
                if (matrix[y][mid] < target) {
                    left = mid + 1;
                }
                if (matrix[y][mid] > target) {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{-5}}, -10);
    }

    // 6~7ms
}
