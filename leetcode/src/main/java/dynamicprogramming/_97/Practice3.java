package dynamicprogramming._97;

public class Practice3 {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean dp[][] = new boolean[s1.length()][s2.length()];

        for(int i=0; i<s1.length(); i++){
            dp[i][0]= s1.charAt(i)== s3.charAt(i);
        }
        for(int i=0; i<s2.length(); i++){
            dp[0][i]= s2.charAt(i)== s3.charAt(i);
        }

        for(int i=1; i<s1.length(); i++){

            for(int j=1; j<s2.length(); j++){

                dp[i][j]= dp[i][j-1] && (s2.charAt(j) == s3.charAt(i+j));
            }
        }

        return dp[s1.length()-1][s2.length()-1];
    }
    // error
}
