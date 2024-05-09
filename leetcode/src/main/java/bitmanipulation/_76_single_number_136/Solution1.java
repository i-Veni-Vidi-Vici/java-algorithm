package bitmanipulation._76_single_number_136;

public class Solution1 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // 각 수를 비트 연산자 XOR로 연산한 결과를 누적한다.
            result ^= num;
        }
        return result;
    }
    // 1ms
}
