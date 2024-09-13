package sort._72_intersection_of_two_arrays_349;

import java.util.*;

public class Practice2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        if (nums1.length < nums2.length) {
            for (int num : nums1) {
                if(!result.contains(num)) {
                    int value = Arrays.binarySearch(nums2, num);
                    if (value >= 0) {
                        result.add(num);
                    }
                }
            }
        } else {
            for (int num : nums2) {
                if(!result.contains(num)) {

                    int value = Arrays.binarySearch(nums1, num);
                    if (value >= 0) {
                        result.add(num);
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    // 7ms
}
