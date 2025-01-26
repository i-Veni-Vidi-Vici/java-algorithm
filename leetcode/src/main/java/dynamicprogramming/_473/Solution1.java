package dynamicprogramming._473;

import java.util.Arrays;

public class Solution1 {
    public boolean makesquare(int[] matchsticks) {
        // 빈 배열이거나 3개 이하의 성냥이 있는 경우 정사각형을 만들 수 없습니다
        if (matchsticks == null || matchsticks.length < 4) return false;

        // 전체 길이의 합을 구합니다
        int sum = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
        }

        // 합이 4로 나누어떨어지지 않으면 정사각형을 만들 수 없습니다
        if (sum % 4 != 0) return false;

        // 각 변의 목표 길이
        int target = sum / 4;

        Arrays.sort(matchsticks);
        reverse(matchsticks);

        // 각 변의 현재 길이를 저장할 배열
        int[] sums = new int[4];

        return dfs(matchsticks, 0, sums, target);
    }

    private boolean dfs(int[] matchsticks, int index, int[] sums, int target) {
        // 모든 성냥을 사용했다면 네 변의 길이가 모두 같은지 확인합니다
        if (index == matchsticks.length) {
            return sums[0] == target && sums[1] == target &&
                    sums[2] == target && sums[3] == target;
        }

        // 현재 성냥을 네 변 중 하나에 추가해봅니다
        int curr = matchsticks[index];
        for (int i = 0; i < 4; i++) {
            // 현재 변에 성냥을 추가했을 때 target을 초과하면 건너뜁니다
            if (sums[i] + curr > target) continue;

            sums[i] += curr;
            if (dfs(matchsticks, index + 1, sums, target)) {
                return true;
            }
            sums[i] -= curr;

            // 중요한 최적화: 같은 길이의 변을 여러 번 시도할 필요가 없습니다
            if (sums[i] == 0) break;
        }

        return false;
    }

    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    // 6ms
}
