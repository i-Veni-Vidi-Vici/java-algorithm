package bitmanipulation._76_single_number_136;

public class Practice2 {
    public int singleNumber(int[] nums) {
        int result =nums[0];
        for(int i =1; i<nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
    // 1ms
}
