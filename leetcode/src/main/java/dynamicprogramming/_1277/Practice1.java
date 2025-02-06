package dynamicprogramming._1277;

import java.util.*;

public class Practice1 {
    public int countSquares(int[][] matrix) {
        int min = Math.min(matrix.length, matrix[0].length);
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[j][k] == 1) {
                    queue.add(new int[]{j, k});
                    count++;
                }
            }
        }

        for (int i = 1; i < min; i++) {
            int size = queue.size();
            while (size > 0) {
                int[] pos = queue.poll();
                size--;
                int x = pos[0] + i;
                int y = pos[1] + i;
                boolean check1 = true;
                boolean check2 = true;

                if (x >= matrix.length || y >= matrix[0].length) {
                    continue;
                }

                for (int j = pos[0]; j <= x; j++) {
                    if (matrix[j][y] != 1) {
                        check1 = false;
                        break;
                    }
                }
                for (int j = pos[1]; j < y; j++) {
                    if (matrix[x][j] != 1) {
                        check2 = false;
                        break;
                    }
                }
                if (check1 && check2) {
                    queue.add(pos);
                    count++;
                }
            }

        }

        return count;
    }
    // 14ms
}
