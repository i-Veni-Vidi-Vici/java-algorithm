package dynamicprogramming._55;

public class Solution1 {
    public boolean canJump(int[] nums) {
        // 도달해야 하는 위치를 마지막 인덱스로 초기화
        int reachablePosition = nums.length - 1;

        // 뒤에서부터 앞으로 순회
        for (int i = nums.length - 2; i >= 0; i--) {
            // 현재 위치에서 점프해서 도달 가능한 위치가
            // reachablePosition보다 크거나 같으면 업데이트
            if (i + nums[i] >= reachablePosition) {
                reachablePosition = i;
            }
        }

        // reachablePosition이 0이면 시작점에서 끝점까지 도달 가능
        return reachablePosition == 0;
    }
    // 1ms
}
