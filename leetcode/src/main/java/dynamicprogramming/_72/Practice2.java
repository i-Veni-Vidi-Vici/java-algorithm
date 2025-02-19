package dynamicprogramming._72;

public class Practice2 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word2.length()][word1.length()];

        for(int i=0; i< dp[0].length; i++){
            dp[0][i]=i;
        }
        for(int i=0; i< dp.length; i++){
            dp[i][0]=i;
        }
        for(int i=1; i<dp[0].length; i++){
            for(int j=1; j<dp.length; j++){
                if(word1.charAt(i)== word2.charAt(j)){
                    dp[j][i]= dp[j-1][i-1];
                }else{
                    dp[j][i]= 1+ Math.min(dp[j-1][i], Math.min(dp[j][i-1], dp[j-1][i-1]));
                }
            }
        }

        return dp[word2.length()-1][word1.length()-1];
    }
    // error
}
