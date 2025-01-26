package dynamicprogramming._473;

public class Practice1 {
    public boolean makesquare(int[] matchsticks) {
        int sum =0;
        for(int num : matchsticks){
            sum+=num;
        }
        if(sum%4 !=0){
            return false;
        }
        int target =  sum/4;
        int[] dp = new int[target+1];
        dp[0]= 0;
        for(int i=1; i<=target; i++){
            for(int num: matchsticks){
                if(i -num== 0|| (i-num>0 && dp[i- num]>0)){
                    dp[i]+=1;
                }

            }
        }
        return false;
    }
    // error
}
