package nonlinear.shortestpath._46_게임맵최단거리;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice2 {
    public int solution(int[][] maps) {
        Queue<List<Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.get(2) - o2.get(2));
        maps[0][0] = 0;
        queue.add(Arrays.asList(0, 0, 1));

        while (!queue.isEmpty()) {
            List<Integer> value = queue.poll();
            if ((value.get(0) == maps[0].length - 1) && (value.get(1) == maps.length - 1)) {
                return value.get(2);
            }

            if (value.get(1) + 1 < maps.length && maps[value.get(1) + 1][value.get(0)] == 1) {
                maps[value.get(1) + 1][value.get(0)] = 0;
                queue.add(Arrays.asList(value.get(0), value.get(1) + 1, value.get(2) + 1));
            }
            if (value.get(1) - 1 >= 0 && maps[value.get(1) - 1][value.get(0)] == 1) {
                maps[value.get(1) - 1][value.get(0)] = 0;
                queue.add(Arrays.asList(value.get(0), value.get(1) - 1, value.get(2) + 1));
            }
            if (value.get(0) + 1 < maps[0].length && maps[value.get(1)][value.get(0) + 1] == 1) {
                maps[value.get(1)][value.get(0) + 1] = 0;
                queue.add(Arrays.asList(value.get(0) + 1, value.get(1), value.get(2) + 1));
            }
            if (value.get(0) - 1 >= 0 && maps[value.get(1)][value.get(0) - 1] == 1) {
                maps[value.get(1)][value.get(0) - 1] = 0;
                queue.add(Arrays.asList(value.get(0) - 1, value.get(1), value.get(2) + 1));
            }
        }

        return -1;
    }
    // 효율성  테스트
    //테스트 1 〉	통과 (31.84ms, 56MB)
    //테스트 2 〉	통과 (7.44ms, 53.1MB)
    //테스트 3 〉	통과 (17.97ms, 52.8MB)
    //테스트 4 〉	통과 (11.42ms, 54MB)
}
