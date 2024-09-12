package sort._70_binary_search_704;

import java.util.Arrays;

public class Practice3 {
    public int search(int[] nums, int target) {
        return Arrays.binarySearch(nums, target)>=0 ? Arrays.binarySearch(nums, target) : -1;
    }
    // 0ms
}
