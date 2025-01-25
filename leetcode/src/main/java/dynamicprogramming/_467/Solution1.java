package dynamicprogramming._467;

public class Solution1 {
    public int findSubstringInWraproundString(String s) {
        int[] dp = new int[26];
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i-1) == 1 ||
                    (s.charAt(i-1) == 'z' && s.charAt(i) == 'a'))) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            int index = s.charAt(i) - 'a';
            dp[index] = Math.max(dp[index], currentLength);
        }

        int sum = 0;
        for (int count : dp) {
            sum += count;
        }

        return sum;
    }
    // 9ms
}
