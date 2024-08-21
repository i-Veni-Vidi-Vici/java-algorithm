package nonlinear.shortestpath._44_network_delay_time_743;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Practice3 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] result = new int[n+1];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(k);
        while (!queue.isEmpty()) {
            Integer value = queue.poll();
            for (int[] time : times) {
                if (time[0] == value) {
                    result[time[1]] += time[2]+ result[value];
                    queue.add(time[1]);
                }
            }
        }

        for (int i = 0; i <n+1; i++) {
            if (i != 0 && i != k && result[i] == 0) {
                return -1;
            }
        }

        return Arrays.stream(result).max().getAsInt();
    }
    // error
}
