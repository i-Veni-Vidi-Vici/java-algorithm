package string.manipulation.repeated_substring_pattern_459;

public class Solution1 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // 길이가 1인 경우는 반복될 수 없음
        if (n <= 1) return false;

        // 가능한 부분 문자열의 길이를 순회
        for (int len = 1; len <= n/2; len++) {
            // 전체 길이가 부분 문자열 길이로 나누어떨어져야 함
            if (n % len != 0) continue;

            boolean isRepeated = true;
            // 부분 문자열
            String substring = s.substring(0, len);

            // 나머지 부분이 부분 문자열과 같은지 확인
            for (int i = len; i < n; i += len) {
                if (!s.substring(i, i + len).equals(substring)) {
                    isRepeated = false;
                    break;
                }
            }

            if (isRepeated) return true;
        }

        return false;
    }
    // 6ms
}
