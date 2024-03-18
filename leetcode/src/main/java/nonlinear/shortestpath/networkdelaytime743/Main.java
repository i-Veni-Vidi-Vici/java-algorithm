package nonlinear.shortestpath.networkdelaytime743;

import java.util.*;

public class Main {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            map.putIfAbsent(time[0], new HashMap<>());
            map.get(time[0]).put(time[1], time[2]);
        }

//        Queue<List<Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.get(1) - o2.get(1)); // 48ms

        Queue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(1))); // 53ms
        queue.add(Arrays.asList(k, 0));
        Map<Integer, Integer> dist = new HashMap<>();

        while (!queue.isEmpty()) {
            List<Integer> current = queue.poll();

            int target = current.get(0);
            int currentDist = current.get(1);

            if (!dist.containsKey(target)) {
                dist.put(target, currentDist);

                if (map.containsKey(target)) {
                    for (Integer source : map.get(target).keySet()) {
                        queue.add(Arrays.asList(source, map.get(target).get(source) + currentDist));
                    }
                }
            }
        }

        if (dist.size() == n) {
            return Collections.max(dist.values());
        }

        return -1;
    }
    // 48ms
}
