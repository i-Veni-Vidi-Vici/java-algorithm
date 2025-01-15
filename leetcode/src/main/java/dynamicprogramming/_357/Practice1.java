package dynamicprogramming._357;

public class Practice1 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n<=1){
            return (int)Math.pow(10, n);
        }

        int[] dp = new int[n+1];

        dp[0]= 0;
        dp[1] = 0;
        dp[2] = 9;

        for(int i=3; i<=n; i++){
            dp[i]= dp[i-1]+ dp[i-1]*i*8;
        }

        return (int)Math.pow(10, n) - dp[n];
    }
    // error
}
