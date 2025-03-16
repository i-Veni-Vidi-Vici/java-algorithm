package dynamicprogramming._279;

public class Practice2 {
    int min =Integer.MAX_VALUE;
    public int numSquares(int n) {
        dfs(n, 0, 0);

        return min;
    }

    private void dfs(int n, int cur, int count){
        if(n== cur){
            min =  Math.min(min, count);
            return ;
        } else if(n<cur){
            return ;
        }
        for(int i=n; i>0; i--){

            dfs(n, cur+ i*i, count+1);
        }

    }
    // Time Limit Exceeded
}
