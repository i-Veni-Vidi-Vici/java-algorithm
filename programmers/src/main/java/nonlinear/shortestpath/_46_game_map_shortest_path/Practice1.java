package nonlinear.shortestpath._46_game_map_shortest_path;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Practice1 {
    public int solution(int[][] maps) {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(2)));
        pq.add(Arrays.asList(0, 0, 1));

        while (!pq.isEmpty()) {
            List<Integer> poll = pq.poll();
            int x = poll.get(0);
            int y = poll.get(1);
            int dist = poll.get(2);

            if (x == maps[y].length - 1 && y == maps.length - 1) {
                return dist;
            }

            if (x + 1 < maps[y].length && maps[y][x + 1] == 1) {
                pq.add(Arrays.asList(x + 1, y, dist + 1));
                maps[y][x + 1] = 0;
            }
            if (x - 1 >= 0 && maps[y][x - 1] == 1) {
                pq.add(Arrays.asList(x - 1, y, dist + 1));
                maps[y][x - 1] = 0;
            }
            if (y - 1 >= 0 && maps[y - 1][x] == 1) {
                pq.add(Arrays.asList(x, y - 1, dist + 1));
                maps[y-1][x] = 0;
            }
            if (y + 1 < maps.length && maps[y + 1][x] == 1) {
                pq.add(Arrays.asList(x, y + 1, dist + 1));
                maps[y + 1][x] = 0;
            }
        }

        return -1;
    }
    //효율성  테스트
    //테스트 1 〉	통과 (29.06ms, 55MB)
    //테스트 2 〉	통과 (12.80ms, 53.2MB)
    //테스트 3 〉	통과 (15.12ms, 53.6MB)
    //테스트 4 〉	통과 (11.51ms, 52.5MB)
}
