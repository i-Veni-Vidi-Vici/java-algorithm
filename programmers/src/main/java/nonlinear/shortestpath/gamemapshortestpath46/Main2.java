package nonlinear.shortestpath.gamemapshortestpath46;

import java.util.*;

public class Main2 {
    public static int solution(int[][] maps) {
//        Queue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(2)));
        Queue<List<Integer>> queue = new ArrayDeque<>();
        queue.add(Arrays.asList(0, 0, 1));

        Map<Integer, List<Integer>> dist = new HashMap<>();
        while (!queue.isEmpty()) {
            List<Integer> poll = queue.poll();
            int n = poll.get(0);
            int m = poll.get(1);
            int distance = poll.get(2);

            if (n == maps.length - 1 && m == maps[n].length - 1) {
                return distance;
            }
            maps[n][m] = 0;
            if (!dist.containsKey(n * 1000 + m)) {
                dist.put(n * 1000 + m, poll);

                if (n + 1 < maps.length && maps[n + 1][m] == 1) {
                    queue.add(Arrays.asList(n + 1, m, distance + 1));
                }
                if (m + 1 < maps[n].length && maps[n][m + 1] == 1) {
                    queue.add(Arrays.asList(n, m + 1, distance + 1));
                }
                if (n - 1 >= 0 && maps[n - 1][m] == 1) {
                    queue.add(Arrays.asList(n - 1, m, distance + 1));
                }
                if (m - 1 >= 0 && maps[n][m - 1] == 1) {
                    queue.add(Arrays.asList(n, m - 1, distance + 1));
                }
            }
        }
//
//        if (dist.containsKey((maps.length - 1) * 1000 + maps[0].length-1)) {
//            return dist.get((maps.length - 1) * 1000 + maps[0].length-1).get(2);
//        }

        return -1;
    }

    public static void main(String[] args) {
        solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
    }

    //테스트 1 〉	통과 (27.05ms, 55.9MB)
    //테스트 2 〉	통과 (5.23ms, 53MB)
    //테스트 3 〉	통과 (14.14ms, 54.6MB)
    //테스트 4 〉	통과 (8.16ms, 53.7MB)
}
