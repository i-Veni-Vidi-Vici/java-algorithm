package dynamicprogramming._97;

public class Solution1 {
    public boolean isInterleave(String s1, String s2, String s3) {
        // 기본 조건 검사
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // dp[i][j]는 s1의 i번째, s2의 j번째까지 문자를 사용하여
        // s3의 i+j번째 문자까지 만들 수 있는지를 나타냅니다
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        // 초기화
        dp[0][0] = true;

        // s1만 사용하는 경우 초기화
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1);
        }

        // s2만 사용하는 경우 초기화
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
        }

        // dp 배열 채우기
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) ||
                        (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
            }
        }

        return dp[s1.length()][s2.length()];
    }
    // 4ms
}
