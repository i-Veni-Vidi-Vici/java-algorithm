package dynamicprogramming._516;

public class Practice1_1 {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];

        for(int i=0; i<len; i++){
            dp[i][i] = 1;
        }

        for(int i=2; i<=len; i++){
            for(int j=0; j<=len-i; j++){
                if(s.charAt(j) == s.charAt(j+i-1)){
                    dp[j][j+i-1] = dp[j+1][j+i-2]  +2;
                }else {
                    dp[j][j+i-1] = Math.max(dp[j+1][j+i-1], dp[j][j+i-2]);
                }
            }
        }

        return dp[0][len-1];
    }
    // 41ms
}
