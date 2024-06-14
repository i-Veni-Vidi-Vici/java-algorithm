package sort._72_intersection_of_two_arrays_349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> result = new HashSet<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2<nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                result.add(nums1[index1]);
                index1++;
                index2++;
            }else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 5ms
}
