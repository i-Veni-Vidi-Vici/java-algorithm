package dynamicprogramming._152;

public class Practice3 {
    public int maxProduct(int[] nums) {
        int max =nums[0];
        int min = nums[0];
        int cur = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++){
            cur= max;
            max = Math.max(nums[i],Math.max(nums[i]*cur, nums[i]*min));
            min = Math.min(nums[i], Math.min(cur*nums[i], min*nums[i]));

            result= Math.max(result, max);
        }

        return result;
    }
    // 2ms
}
