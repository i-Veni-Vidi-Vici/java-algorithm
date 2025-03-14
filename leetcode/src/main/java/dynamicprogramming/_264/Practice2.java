package dynamicprogramming._264;

public class Practice2 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        int two=1;
        int three = 1;
        int five =1;

        for(int i=1; i<n; i++){
            int min= Math.min(2*two, Math.min(3*three, 5*five));
            if(min==2*two){
                two++;
            }
            if(min == 3*three){
                three++;
            }
            if(min== 5*five){
                five++;
            }

            dp[i]= min;
            System.out.println(min);

        }

        return dp[n-1];
    }
    // error
}
