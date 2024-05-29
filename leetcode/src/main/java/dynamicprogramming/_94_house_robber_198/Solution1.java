package dynamicprogramming._94_house_robber_198;

// TODO : 재귀 - 브루트 포스
public class Solution1 {
    public static long calc = 0;
    public static int rob(int[] nums, int n) {
        calc++;
        if (n < 0)
            return 0;
        // 이전 결과와 (전전 결과 + 현재 결과) 중 큰 값 리턴
        return Math.max(
                rob(nums, n - 1),
                rob(nums, n - 2) + nums[n]
        );
    }

    public static int rob(int[] nums) {
        // 피보나치 수열 형태로 계산하여 리턴
        return rob(nums, nums.length - 1);
    }

    public static void main(String[] args) {
        rob(new int[]{2, 7, 9, 3, 1, 5});
    }

    // Time Limit Exceeded
}
