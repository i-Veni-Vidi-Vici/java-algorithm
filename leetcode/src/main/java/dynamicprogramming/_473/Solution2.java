package dynamicprogramming._473;

import java.util.Arrays;

public class Solution2 {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) {
            return false;
        }

        int sum = 0;
        for (int stick : matchsticks) {
            sum += stick;
        }

        if (sum % 4 != 0) {
            return false;
        }

        int target = sum / 4;
        Arrays.sort(matchsticks);

        for (int i = 0; i < matchsticks.length / 2; i++) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[matchsticks.length - 1 - i];
            matchsticks[matchsticks.length - 1 - i] = temp;
        }

        int[] sides = new int[4];
        return dfs(matchsticks, sides, 0, target);
    }

    private boolean dfs(int[] matchsticks, int[] sides, int index, int target) {
        if (index == matchsticks.length) {
            return sides[0] == target && sides[1] == target && sides[2] == target && sides[3] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sides[i] + matchsticks[index] > target) {
                continue;
            }

            sides[i] += matchsticks[index];
            if (dfs(matchsticks, sides, index + 1, target)) {
                return true;
            }
            sides[i] -= matchsticks[index];

            if(sides[i]== 0) break;
        }

        return false;
    }

    // 5ms
}
