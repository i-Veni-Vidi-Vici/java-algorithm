package linear.array._11_product_of_array_except_self_238;

import java.util.Arrays;

public class Practice1 {
    public int[] productExceptSelf(int[] nums) {
        int result =1;
        int zeroCount =0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }

            result *= num;
        }
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = result / nums[i];
            }
        } else if (zeroCount==1){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                }else {
                    nums[i] = result;
                }
            }
        }else {
                Arrays.fill(nums,0);
        }

        return nums;
    }

    // 2ms
}
