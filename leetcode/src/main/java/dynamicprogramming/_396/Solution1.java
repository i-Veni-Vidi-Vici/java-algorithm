package dynamicprogramming._396;

public class Solution1 {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;        // 배열의 모든 원소의 합
        int F = 0;          // F(0)의 값

        // 초기값 계산
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }

        int maxF = F;

        // 각 회전에 대해 F(k) 계산
        for (int k = 1; k < n; k++) {
            // F(k) = F(k-1) + sum - n * nums[n-k]
            F = F + sum - n * nums[n-k];
            maxF = Math.max(maxF, F);
        }

        return maxF;
    }
    // 4ms
}
