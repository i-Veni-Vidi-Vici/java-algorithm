package nonlinear.graph._43_course_schedule_207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            map.putIfAbsent(prerequisite[0], new ArrayList<>());
            map.get(prerequisite[0]).add(prerequisite[1]);
        }

        Map<Integer, Integer> result = new HashMap<>();

        for (Integer i : map.keySet()) {
            for (Integer integer : map.get(i)) {
                while (map.get(i) != null) {

                    if (result.containsKey(integer)) {
                        return false;
                    } else {
                        result.put(integer, 1);
                    }
//                    integer = map.get(integer);
                }
            }

        }
        result = new HashMap<>();

        return true;
    }
}
// error
