package linear.priorityqueue._28_k_cloest_points_to_origin_973;

import java.util.PriorityQueue;

public class Main {
    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][];
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            if ((Math.pow(o1[0],2) + Math.pow(o1[1],2)) > (Math.pow(o2[0],2) + Math.pow(o2[1],2))) {
                return 1;
            } else {
                return -1;
            }
        });

        // queue.addAll(Arrays.asList(points)); // 39~41ms
        for (int[] point : points) {
            queue.add(point);
        } // 35ms

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        kClosest(new int[][]{{-5, 4}, {-6, -5}, {4, 6}},2);
    }

    // 35ms
}
