package nonlinear.shortestpath.gamemapshortestpath46;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
    public static int solution(int[][] maps) {

        Queue<List<Integer>> queue = new ArrayDeque<>();

        queue.add(Arrays.asList(0, 0, 1));
        while (!queue.isEmpty()) {
            List<Integer> poll = queue.poll();
            int n = poll.get(0);
            int m = poll.get(1);
            int dist = poll.get(2);

            if (n == maps.length - 1 && m == maps[n].length - 1) {
                return dist;
            }
            maps[n][m] = -1;

            if (n + 1 < maps.length && maps[n + 1][m] == 1) {
                queue.add(Arrays.asList(n + 1, m, dist + 1));
            }
            if (m + 1 < maps[n].length && maps[n][m + 1] == 1) {
                queue.add(Arrays.asList(n , m+1, dist + 1));
            }
            if (n - 1 >= 0 && maps[n - 1][m] == 1) {
                queue.add(Arrays.asList(n - 1, m, dist + 1));
            }
            if (m - 1 >= 0 && maps[n][m - 1] == 1) {
                queue.add(Arrays.asList(n , m-1, dist + 1));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
    }
//테스트 1 〉	통과 (11.74ms, 54.2MB)
//테스트 2 〉	통과 (6.73ms, 71.2MB)
//테스트 3 〉	통과 (13.32ms, 56.4MB)
//테스트 4 〉	통과 (7.98ms, 53.9MB)

}
