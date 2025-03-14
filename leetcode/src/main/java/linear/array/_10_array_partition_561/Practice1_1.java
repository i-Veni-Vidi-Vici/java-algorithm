package linear.array._10_array_partition_561;

import java.util.*;

public class Practice1_1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
            sum+= nums[i];
        }
        return sum;
    }
    // 12ms
}
