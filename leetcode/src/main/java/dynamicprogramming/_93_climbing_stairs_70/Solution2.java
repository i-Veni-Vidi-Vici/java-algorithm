package dynamicprogramming._93_climbing_stairs_70;


// TODO : 메모이제이션(하향식)
public class Solution2 {
    // 문제 제약 조건에 따라 45에서 1칸 더 크게 지정
    int[] dp = new int[46];

    public int climbStairs(int n) {
        // 2 이하는 미리 지정한 값 리턴
        if (n <= 2)
            return n;

        // 미리 계산한 결과가 있다면 해당 값 리턴
        if (dp[n] != 0)
            return dp[n];
        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];
    }
    // 0ms
}
