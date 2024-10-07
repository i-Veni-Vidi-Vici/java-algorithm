package dynamicprogramming._93_climbing_stairs_70;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }

        int left = 0;
        int right = 0;


        if (n > 0) {
            if(map.containsKey(n-1)){
                left = map.get(n-1);
            } else{
                left = climbStairs(n - 1);
            }
            map.put(n-1, left);
        }
        if (n > 1) {
            if(map.containsKey(n-1)){
                right = map.get(n-2);
            } else{
                right = climbStairs(n - 2);
            }
            map.put(n-2,right);
        }

        return left + right;
    }

    // 0ms
}
