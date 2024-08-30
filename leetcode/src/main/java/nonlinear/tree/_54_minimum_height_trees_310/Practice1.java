package nonlinear.tree._54_minimum_height_trees_310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Practice1 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            for (int[] edge : edges) {
                if ((edge[0] == i || edge[1] == i) && (edge[0] > i || edge[1] > i)) {
                    if (edge[0] > i) {
                        queue.add(edge[0]);
                    }
                    if (edge[1] > i) {
                        queue.add(edge[1]);
                    }
                }
            }

            while (!queue.isEmpty()) {
                queue.poll();
            }
        }
        return null;
    }

    // error
}
