package dynamicprogramming._93_climbing_stairs_70;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        int one = 0;
        int two = 0;
        if (n > 0) {
            if (!map.containsKey(n - 1)) {
                one = climbStairs(n - 1);
                map.put(n - 1, one);
            } else {
                one = map.get(n - 1);
            }

        }
        if (n > 1) {
            if (!map.containsKey(n - 2)) {
                two = climbStairs(n - 2);
                map.put(n - 2, one);
            } else {
                two = map.get(n - 2);
            }
        }

        return one + two;
    }

    // 0ms
}
