package dynamicprogramming._357;

public class Practice2 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        if(n==2) return 91;
        int[] dp = new int[n+1];
        dp[0]= 1;
        dp[1] = 10;
        dp[2] = 91;

        for(int i=3; i<=n; i++){
            int a = (int)Math.pow(10, i-1)-dp[i-1];
            dp[i]=  (int)Math.pow(10, i) -(a*10*(i-1) +a*9);

        }

        return dp[n];
    }

    // error
}
