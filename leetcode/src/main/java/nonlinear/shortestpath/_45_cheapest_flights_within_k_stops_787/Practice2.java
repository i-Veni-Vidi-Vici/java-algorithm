package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.*;

public class Practice2 {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, List<Integer>>> data = new HashMap<>();
        for (int[] flight : flights) {
            data.putIfAbsent(flight[0], new HashMap<>());
            data.get(flight[0]).put(flight[1], Arrays.asList(flight[2], 0));
        }

        PriorityQueue<Map.Entry<Integer, List<Integer>>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.getValue().get(0)));
        pq.add(new AbstractMap.SimpleEntry<>(src, Arrays.asList(0, -1)));

        Map<Integer, List<Integer>> dist = new HashMap<>();


        while (!pq.isEmpty()) {
            Map.Entry<Integer, List<Integer>> polled = pq.poll();
            int key = polled.getKey();
            List<Integer> value = polled.getValue();

            if (!dist.containsKey(key) && value.get(1) <= k) {
                if (key == dst) {
                    return value.get(0);
                }

                dist.put(key, value);

                for (Map.Entry<Integer, List<Integer>> entry : data.get(key).entrySet()) {
                    if (value.get(1) < k) {
                        pq.add(new AbstractMap.SimpleEntry<>(entry.getKey(),
                                Arrays.asList(entry.getValue().get(0) + value.get(0),
                                       value.get(1) + 1)));
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // [[4,1,1],[1,2,3],[0,3,2],[0,4,10],[3,1,1],[1,4,3]]
        findCheapestPrice(5,new int[][]{{4,1,1},{1,2,3},{0,3,2}, {0,4,10}, {3,1,1}, {1,4,3}}, 2,1,0);
    }
    // error
}
