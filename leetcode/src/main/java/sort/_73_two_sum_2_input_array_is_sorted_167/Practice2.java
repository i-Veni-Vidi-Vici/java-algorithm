package sort._73_two_sum_2_input_array_is_sorted_167;

public class Practice2 {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {

                return new int[]{++left, ++right};
            }
        }

        return null;
    }
    // 2ms
}
