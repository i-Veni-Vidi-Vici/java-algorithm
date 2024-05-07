package sort._73_two_sum_2_input_array_is_sorted_167;

import java.util.Arrays;

// 이진 검색 메서드 사용
public class Main1 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int result = target - numbers[i];
            int index = Arrays.binarySearch(Arrays.copyOfRange(numbers, i+1, numbers.length), result);
            if (index >=0) {
                return new int[]{i + 1,i+1+index + 1};
            }
        }

        return null;
    }

    // 122ms
}
