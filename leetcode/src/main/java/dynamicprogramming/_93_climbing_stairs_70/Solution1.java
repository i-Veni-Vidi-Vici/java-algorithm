package dynamicprogramming._93_climbing_stairs_70;

public class Solution1 {
    public int climbStairs(int n) {
        // 2 이하는 미리 지정한 값 리턴
        if (n <= 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    // Time Limit Exceeded
}
