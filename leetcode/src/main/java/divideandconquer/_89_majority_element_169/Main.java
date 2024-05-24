package divideandconquer._89_majority_element_169;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        int max = Integer.MIN_VALUE;
        int result = 0;
        for (Integer i : map.keySet()) {
            if (max < map.get(i)) {
                result = i;
                max = map.get(i);
            }
        }

        return result;
    }
    // 16ms
}
