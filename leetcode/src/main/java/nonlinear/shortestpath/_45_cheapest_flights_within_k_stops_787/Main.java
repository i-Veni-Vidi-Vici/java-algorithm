package nonlinear.shortestpath._45_cheapest_flights_within_k_stops_787;

import java.util.*;

public class Main {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int[] flight : flights) {
            map.putIfAbsent(flight[0], new HashMap<>());
            map.get(flight[0]).put(flight[1], flight[2]);
        }

        Queue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(1)));
        queue.add(Arrays.asList(src, 0, 0));

        Map<Integer, Integer> dist = new HashMap<>();


        while (!queue.isEmpty()) {
            List<Integer> poll = queue.poll();
            int start = poll.get(0);
            int end = poll.get(1);
            int count = poll.get(2);

            if (start == dst)
                return end;
            if (!dist.containsKey(start)) {
                dist.put(start, end);
                count++;
                if (map.containsKey(start) && count<=k) {
                    for (Integer i : map.get(start).keySet()) {
                        queue.add(Arrays.asList(i, map.get(start).get(i) + end, count));
                    }
                }
            }
        }

        if (dist.containsKey(dst)) {
            return dist.get(dst);
        } else return -1;
    }

    // error
}
