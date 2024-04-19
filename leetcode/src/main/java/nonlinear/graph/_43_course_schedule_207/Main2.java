package nonlinear.graph._43_course_schedule_207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static boolean dfs(Map<Integer, List<Integer>> map, List<Integer> graph, Integer complete) {
        if (graph.contains(complete)) {
            return false;
        }

        for (int i = 0; i < map.get(complete).size(); i++) {
            if (map.containsKey(map.get(complete).get(i)) && !map.get(map.get(complete).get(i)).isEmpty()) {
                    graph.add(complete);
                if (!dfs(map, graph, map.get(complete).get(i))) {
                    return false;
                }

            } else map.get(complete).remove(i--);
        }

        return true;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            map.putIfAbsent(prerequisite[0], new ArrayList<>());
            map.get(prerequisite[0]).add(prerequisite[1]);
        }
        List<Integer> graph = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if (!dfs(map, graph, key)) {
                return false;
            }
        }

        return true;
    }


    // error

    public static void main(String[] args) {
        canFinish(7, new int[][]{{1, 0},{0,3},{0,2}, {3,2},{2,5},{4,5} ,{5,6}, {2,4}});
    }
}