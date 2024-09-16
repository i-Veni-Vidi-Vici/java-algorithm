package sort._74_search_a_2d_matrix_2_240;

import java.util.Arrays;

public class Practice3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]> target){
                return false;
            }
            int value = Arrays.binarySearch(matrix[i], target);
            if(value>=0){
                return true;
            }
        }

        return false;
    }

    // 0ms
}
