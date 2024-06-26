package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new HashMap<>());
            graph.get(flight[0]).put(flight[1], flight[2]);
        }

        Queue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(1)));
        pq.add(Arrays.asList(src, 0, 0));

        while (!pq.isEmpty()) {
            List<Integer> cur = pq.poll();
            int u = cur.get(0);
            int price_u = cur.get(1);
            int k_visited = cur.get(2);

            if (u == dst)
                return price_u;
            if (k_visited <= k) {
                k_visited += 1;
                if (graph.containsKey(u)) {
                    for (Map.Entry<Integer, Integer> v : graph.get(u).entrySet()) {
                        int alt = price_u + v.getValue();
                        pq.add(Arrays.asList(v.getKey(), alt, k_visited));
                    }
                }
            }
        }
        return -1;
    }

    // 구현실패 코드로 한줄한줄 복습, Time Limit Exceeded
}
