package nonlinear.graph._43_course_schedule_207;

import java.util.*;

public class Practice1 {

    public static boolean dfs(Map<Integer, List<Integer>> data, int value, List<Integer> check){
        while (data.containsKey(value) && !data.get(value).isEmpty()) {
            Integer removed = data.get(value).remove(data.get(value).size() - 1);
            if (check.contains(removed)) {
                return false;
            }
            check.add(removed);
           if(!dfs(data, removed, check)){
               return false;
           } else{
               for (Integer integer : data.keySet()) {
                   data.get(integer).remove(removed);
               }
               check.remove(removed);
           }
        }

        return true;
    }
    public  static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> data = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            data.putIfAbsent(prerequisite[0], new ArrayList<>());
            data.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (Integer i : data.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            if (!dfs(data, i, list)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // [[0,1],[0,2],[1,2]]
        canFinish(3, new int[][]{{0, 2}, {0, 1}, {1, 2}});
    }

    // 168 ms
}
