package dynamicprogramming._91;

public class Practice4 {
    public int numDecodings(String s) {
        if(s.charAt(0)== '0'){
            return 0;
        }
        int[] dp =new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2; i<dp.length; i++){
            if(s.charAt(i-1)>'0'){
                dp[i]= dp[i-1];
            }
            int tmp = Integer.parseInt(s.substring(i-2,i));
            if(tmp>=10 && tmp<=26){
                dp[i]+= dp[i-2];
            }
        }

        return dp[s.length()];
    }
    // 1ms
}
