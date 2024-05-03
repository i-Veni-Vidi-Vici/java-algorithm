package sort._72_intersection_of_two_arrays_349;

import java.util.*;

// map 으로 구현
public class Main1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : nums1) {
            map.put(i, 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) > 1) {
                result.add(i);
            }
        }
        return  result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 5ms
}
