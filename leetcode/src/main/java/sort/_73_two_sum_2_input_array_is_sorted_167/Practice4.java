package sort._73_two_sum_2_input_array_is_sorted_167;

import java.util.Arrays;

public class Practice4 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int value = Arrays.binarySearch(numbers, i+1, numbers.length, target-numbers[i]);
            if(value>=0){
                return new int[]{i+1, value+1};
            }
        }

        return null;
    }
    //3ms
}
