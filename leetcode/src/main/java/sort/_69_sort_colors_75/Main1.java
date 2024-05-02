package sort._69_sort_colors_75;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
                nums[index++] = i;
            }
        }
    }

    // 1ms
}
