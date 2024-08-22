package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Practice3 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer,Integer>> map = new HashMap<>();
        for (int[] flight : flights) {
            map.putIfAbsent(flight[0], new HashMap<>());
            map.get(flight[0]).put(flight[1],flight[2]);
        }

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.get(2) - o1.get(1));
        pq.add(List.of(src, 0, 0));

        while (!pq.isEmpty()) {
            List<Integer> value = pq.poll();

            if (map.containsKey(value.get(0))) {
                for (Integer key : map.get(value.get(0)).keySet()) {
                    if (value.get(2) + 1 < k) {
                        pq.add(List.of(key, map.get(value.get(0)).get(key)+ value.get(1), value.get(2) + 1));
                    }
                }
            }

        }

        return null;

    }
}
