package dynamicprogramming._467;

public class Practice1_1 {
    public int findSubstringInWraproundString(String s) {
        int[] dp = new int[26];
        int count =0;


        for(int i=0; i<s.length(); i++){
            if(i>0 &&  ((s.charAt(i)- s.charAt(i-1)== 1 )|| (s.charAt(i)== 'a' && s.charAt(i-1)== 'z'))){
                count++;
            }else{
                count =1;
            }
            dp[s.charAt(i)-'a'] = Math.max(dp[s.charAt(i)-'a'], count);
        }

        int result =0;
        for(int num : dp){
            result += num;
        }

        return result;
    }
    // 11ms
}
