package nonlinear.shortestpath._44_network_delay_time_743;

import java.util.*;

public class Practice2_1 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<List<Integer>>> data = new HashMap<>();

        for (int[] time : times) {
            data.putIfAbsent(time[0], new ArrayList<>());
            data.get(time[0]).add(Arrays.asList(time[1], time[2]));
        }

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(1)));
        pq.add(Arrays.asList(k, 0));

        int[] distMin = new int[n];
        int result = Integer.MIN_VALUE;
        Arrays.fill(distMin, Integer.MAX_VALUE);


        while (!pq.isEmpty()) {
            List<Integer> min = pq.poll();

            if (distMin[min.get(0) - 1] == Integer.MAX_VALUE) {
                distMin[min.get(0) - 1] = min.get(1);
                result = Math.max(result, min.get(1));
                n--;

                if (data.containsKey(min.get(0))) {
                    for (List<Integer> integers : data.get(min.get(0))) {
                        integers.set(1, integers.get(1) + min.get(1));
                        pq.add(integers);
                    }
                }
            }
        }

        if (n != 0) {
            return -1;
        }

        return result;
    }

    // 50ms ->(스트림사용 제거 -> 기본으로 돌아가는 for문에서 result 계산) 47ms
}
