package dynamicprogramming._313;

public class Practice1 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[primes.length];
        long[] ugly = new long[n];
        ugly[0]= 1;
        for(int i=1; i<n; i++){
            ugly[i] = ugly[dp[0]]*primes[0];

            for(int j=1; j<primes.length; j++){
                if(ugly[i] >ugly[dp[j]]*primes[j]){
                    ugly[i] = ugly[dp[j]]*primes[j];
                }
            }
            for(int j=0; j<primes.length; j++){
                if(ugly[i] == ugly[dp[j]]*primes[j]){
                    dp[j]++;
                }
            }
        }

        return (int)ugly[n-1];
    }
    // 45ms
}
