package string.manipulation._594;

import java.util.HashMap;

public class Solution1 {
    public int findLHS(int[] nums) {
        // 각 숫자의 등장 횟수를 저장할 HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // 각 숫자의 등장 횟수 카운트
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        // 각 숫자에 대해 harmonious subsequence 검사
        for (int num : map.keySet()) {
            // 현재 숫자보다 1 큰 수가 존재하는 경우
            if (map.containsKey(num + 1)) {
                // 두 숫자의 등장 횟수의 합을 계산
                int currentLen = map.get(num) + map.get(num + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
    // 16ms
}
