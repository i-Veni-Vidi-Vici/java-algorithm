package nonlinear.graph.courseschedule207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void dfs(Map<Integer, List<Integer>> map,List<Integer> result){
        for (Integer i : map.keySet()) {
            if (map.get(i).isEmpty()) {
                result.add(i);
                map.remove(i);
                dfs(map, result);
            }
            int count =0;
            if (!map.containsKey(i)) {
                return;
            }
            for (int j = 0; j < map.get(i).size()-count; j++) {
                if ((!map.containsKey(map.get(i).get(j)) || map.get(i).isEmpty())&& !result.contains(map.get(i).get(j))) {
                    result.add(map.get(i).get(j));
                    map.get(i).remove(j);
                    count++;
                    dfs(map, result);
                    if (!map.containsKey(i)) {
                        return;
                    }
                }
            }
        }
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        if (prerequisites.length == 0) {
            return true;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] prerequisite : prerequisites) {
            map.putIfAbsent(prerequisite[0], new ArrayList<>());
            map.get(prerequisite[0]).add(prerequisite[1]);
        }

        dfs(map, result);

        return result.size() == numCourses;

    }

    public static void main(String[] args) {
        canFinish(2, new int[][]{{1, 0}});
    }

    // error
}
