package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.*;

public class Practice2 {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, List<Integer>>> data = new HashMap<>();
        for (int[] flight : flights) {
            data.putIfAbsent(flight[0], new HashMap<>());
            data.get(flight[0]).put(flight[1], Arrays.asList(flight[2], 0));
        }

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.get(1)));
        pq.add(Arrays.asList(src, 0, -1));

        Map<Integer, List<Integer>> dist = new HashMap<>();

        while (!pq.isEmpty()) {
            List<Integer> poll = pq.poll();
            Integer key = poll.get(0);

            if (poll.get(2) <= k) {
                if (key == dst) {
                    return poll.get(1);
                }

                dist.put(key, Arrays.asList(poll.get(1), poll.get(2)));
                if (data.containsKey(key)) {

                    for (Map.Entry<Integer, List<Integer>> entry : data.get(key).entrySet()) {
                        if (poll.get(2) < k) {
                            int a = entry.getValue().get(0) + poll.get(1);
                            int b = poll.get(2) + 1;
                            pq.add(Arrays.asList(entry.getKey(), a, b));
                        }
                    }
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // [[0,1,1],[0,2,5],[1,2,1],[2,3,1]]
        findCheapestPrice(4, new int[][]{{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {2, 3, 1}}, 0, 3, 1);
    }
    // error ->Time Limit Exceeded
}
