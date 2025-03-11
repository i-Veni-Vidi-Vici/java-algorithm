package linear.array._07_two_sum_1;

public class Practice1_1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]== target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
    // 45ms
}
