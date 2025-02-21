package dynamicprogramming._91;

public class Practice2 {
    public int numDecodings(String s) {
        char[] ch = s.toCharArray();
        int dp[] = new int[ch.length];

        if(ch[0]!= '0'){
            dp[0]= 1;
        }

        for(int i=1; i<dp.length; i++){
            if(ch[i-1]>='1' && ch[i-1]<='2' && ch[i]<= '6' && ch[i]>='1' ){
                dp[i]=1+ dp[i-1];
            }else{
                dp[i]= dp[i-1];
            }
        }


        return dp[dp.length-1];
    }
    // error
}
