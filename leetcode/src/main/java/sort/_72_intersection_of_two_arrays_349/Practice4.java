package sort._72_intersection_of_two_arrays_349;

import java.util.*;
public class Practice4 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        if (nums1.length > nums2.length) {
            Arrays.sort(nums1);

            for (int num : nums2) {
                int value = Arrays.binarySearch(nums1, num);
                if (value >= 0) {
                    result.add(num);
                }
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        } else {
            Arrays.sort(nums2);

            for (int num : nums1) {
                int value = Arrays.binarySearch(nums2, num);
                if (value >= 0) {
                    result.add(num);
                }
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        }

    }
    // 7ms
}
