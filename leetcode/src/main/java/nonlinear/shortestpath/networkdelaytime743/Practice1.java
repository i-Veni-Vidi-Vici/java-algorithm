package nonlinear.shortestpath.networkdelaytime743;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Practice1 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> data = new HashMap<>();
        for (int[] time : times) {
            data.putIfAbsent(time[0], new HashMap<>());
            data.get(time[0]).put(time[1], time[2]);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        pq.add(new AbstractMap.SimpleEntry<>(k, 0));

        Map<Integer, Integer> dist = new HashMap<>();
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> cur = pq.poll();
            int u = cur.getKey();
            int dist_u = cur.getValue();

            if (!dist.containsKey(u)) {
                dist.put(u, dist_u);
                if (data.containsKey(u)) {
                    for (Map.Entry<Integer, Integer> v : data.get(u).entrySet()) {
                        pq.add(new AbstractMap.SimpleEntry<>(v.getKey(),dist_u + v.getValue()));
                    }
                }
            }
        }

        if (dist.size() == n) {
            return Collections.max(dist.values());
        }

        return -1;
    }

    //47ms
}