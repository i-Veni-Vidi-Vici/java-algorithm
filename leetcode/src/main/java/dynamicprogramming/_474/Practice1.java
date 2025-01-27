package dynamicprogramming._474;

public class Practice1 {
    int max =0;
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[strs.length][2];

        for(int i=0; i<strs.length; i++){
            for(char c : strs[i].toCharArray()){
                if(c=='0'){
                    dp[i][0]+=1;
                }else{
                    dp[i][1]+=1;
                }
            }
        }

        dfs(dp, 0, 0, m,n, 0,0);

        return max;
    }

    private void dfs(int[][] dp, int index,int count,  int m, int n, int zero, int one){
        if(zero>m || one>n){
            max= Math.max(max, count-1);
            return;
        }

        for(int i=index;i<dp.length; i++ ){
            System.out.println(index + " " + zero +" "+ one);
            dfs(dp, i+1, count+1, m, n, zero+dp[i][0], one+dp[i][1]);
        }

    }
    // error
}
