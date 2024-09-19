package bitmanipulation._76_single_number_136;

public class Practice3 {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num : nums){
            result ^= num;
        }

        return result;
    }
    // 1ms
}
