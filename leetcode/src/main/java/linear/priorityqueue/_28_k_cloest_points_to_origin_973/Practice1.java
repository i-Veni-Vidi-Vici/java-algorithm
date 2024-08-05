package linear.priorityqueue._28_k_cloest_points_to_origin_973;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][];
        Queue<int[]> pq = new PriorityQueue<>(
                (points1, points2) -> (int) ((Math.pow(points1[0], 2) + Math.pow(points1[1], 2)) - (
                        Math.pow(points2[0], 2) + Math.pow(points2[1], 2))));

        for (int[] point : points) {
            pq.add(point);
        }
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;

    }

    // 36ms
}
