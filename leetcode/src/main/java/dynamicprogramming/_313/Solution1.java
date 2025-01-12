package dynamicprogramming._313;

public class Solution1 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];
        dp[0] = 1;

        int[] pointers = new int[primes.length];

        for (int i = 1; i < n; i++) {
            long minVal = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                minVal = Math.min(minVal, dp[pointers[j]] * primes[j]);
            }
            dp[i] = minVal;

            for (int j = 0; j < primes.length; j++) {
                if (dp[pointers[j]] * primes[j] == minVal) {
                    pointers[j]++;
                }
            }
        }

        return (int) dp[n - 1];
    }
    // 40ms
}
