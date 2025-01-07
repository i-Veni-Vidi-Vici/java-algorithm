package dynamicprogramming._264;

public class Practice1 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];

        dp[0] = 1;

        int two = 1;
        int three = 1;
        int five = 1;
        for(int i=1; i<n; i++){
            int min = Math.min(Math.min(two*2, five*5), three*3);
            if(min == two*2){
                two++;
                while(!(two %2 ==0 || two%3==0 || two%5==0)){
                    two++;
                }
            }
            if(min == three*3){
                three++;

                while(!(three %2 ==0 || three%3==0 || three%5==0)){
                    three++;
                }
            }
            if(min == five*5){
                five++;
                while(!(five %2 ==0 || five%3==0 || five%5==0)){
                    five++;
                }
            }
            dp[i]= min;
        }

        return dp[n-1];
    }
    // error
}
