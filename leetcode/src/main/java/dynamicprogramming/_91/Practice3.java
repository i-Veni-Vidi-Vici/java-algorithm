package dynamicprogramming._91;

public class Practice3 {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        int[] dp = new int [s.length()+1];
        char[] ch = s.toCharArray();

        dp[0]= 1;
        dp[1]= 1;

        for(int i=2; i<dp.length; i++){
            if(ch[i-1]>'0'){
                dp[i]= dp[i-1];
            }
            if(ch[i-2]<='2' && ch[i-2]>='1' && ch[i-1]<='6'){
                dp[i]+=dp[i-2];
            }
        }

        return dp[s.length()];
    }
    // error
}
