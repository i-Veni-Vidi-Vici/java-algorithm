package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.*;

public class Practice2 {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, List<Integer>>> data = new HashMap<>();
        for (int[] flight : flights) {
            data.putIfAbsent(flight[0], new HashMap<>());
            data.get(flight[0]).put(flight[1], Arrays.asList(flight[2], 0));
        }

        PriorityQueue<Map.Entry<Integer, List<Integer>>> pq = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.getValue().get(0)));
        pq.add(new AbstractMap.SimpleEntry<>(src, Arrays.asList(0, -1)));

        Map<Integer, List<Integer>> dist = new HashMap<>();

        while (!pq.isEmpty()) {
            Map.Entry<Integer, List<Integer>> polled = pq.poll();
            Integer key = polled.getKey();
            List<Integer> value = polled.getValue();


            if (!dist.containsKey(key) && value.get(1) <= k) {
                if (key == dst) {
                    return value.get(0);
                }

                dist.put(key, value);
                if (data.containsKey(key)) {
                    for (Map.Entry<Integer, List<Integer>> entry : data.get(key).entrySet()) {
                        if (value.get(1) < k) {
                            pq.add(new AbstractMap.SimpleEntry<>(entry.getKey(), Arrays.asList(entry.getValue().get(0) + value.get(0),
                                            value.get(1) + 1)));
                        }
                    }
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // [[0,1,1],[0,2,5],[1,2,1],[2,3,1]]
        findCheapestPrice(4, new int[][]{{0,1,1}, {0,2,5}, {1,2,1}, {2,3,1}}, 0, 3, 1);
    }
    // error
}
