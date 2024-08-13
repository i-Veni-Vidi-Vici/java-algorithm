package linear.hashtable._33_top_k_frequent_elements_347;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int size =k;
        int[] result = new int[size];


        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (k > 0) {
            int max = 0;
            int select =0;

            for (Integer i : map.keySet()) {
                if (max < map.get(i)) {
                    max = map.get(i);
                    select =i;
                }
            }

            map.remove(select);
            result[size - k--] = select;
        }

        return result;
    }

    // 48ms
}
