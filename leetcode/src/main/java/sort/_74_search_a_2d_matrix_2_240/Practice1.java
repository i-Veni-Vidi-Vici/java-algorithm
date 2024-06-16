package sort._74_search_a_2d_matrix_2_240;

import java.util.Arrays;

public class Practice1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right =0;
        for (int i = matrix[0].length-1; i >0; i--) {
            if (matrix[0][i] == target) {
                return true;
            }
            if (matrix[0][i] < target) {
                right=i;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {

            int index = Arrays.binarySearch(matrix[i], 0, right + 1, target);
            if (index >= 0) {
                return true;
            }
        }

        return false;
    }

    // 6ms
}
