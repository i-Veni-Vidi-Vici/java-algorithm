package dynamicprogramming._45;

public class Solution1 {
    public int jump(int[] nums) {
        // 배열의 길이가 1이면 점프가 필요없음
        if (nums.length <= 1) return 0;

        int maxReach = 0;    // 현재까지 도달할 수 있는 최대 위치
        int currentMax = 0;  // 현재 점프로 도달할 수 있는 최대 위치
        int jumps = 0;       // 필요한 점프 횟수

        for (int i = 0; i < nums.length - 1; i++) {
            // 각 위치에서 도달할 수 있는 최대 위치 갱신
            maxReach = Math.max(maxReach, i + nums[i]);

            // 현재 점프로 갈 수 있는 범위의 끝에 도달했다면
            if (i == currentMax) {
                jumps++;             // 점프 횟수 증가
                currentMax = maxReach; // 다음 점프로 갈 수 있는 최대 범위 갱신
            }
        }

        return jumps;
    }
    // 1ms
}
