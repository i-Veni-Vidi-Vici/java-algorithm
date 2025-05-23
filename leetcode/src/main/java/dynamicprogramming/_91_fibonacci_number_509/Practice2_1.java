package dynamicprogramming._91_fibonacci_number_509;

public class Practice2_1 {
    public int fib(int n) {
        if(n<=1 ){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<n+1; i++){
            dp[i]= dp[i-1]+ dp[i-2];
        }

        return  dp[n];
    }
    // 4ms
}
