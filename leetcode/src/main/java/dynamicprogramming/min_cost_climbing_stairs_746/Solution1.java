package dynamicprogramming.min_cost_climbing_stairs_746;

public class Solution1 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];
        if (n <= 2) return Math.min(first, second);
        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
    // 0ms
}
