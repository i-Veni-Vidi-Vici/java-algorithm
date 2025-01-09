package dynamicprogramming._279;

public class Practice1 {
    int min =Integer.MAX_VALUE;
    public int numSquares(int n) {
        dfs(n, n, 0);
        return min;
    }

    private void dfs(int n, int cur, int count){
        if(n== 0){
            min = Math.min(min, count);
            return;
        }
        if(cur <=0){
            return;
        }


        if(Math.pow(cur, 0.5)*Math.pow(cur, 0.5)== cur){
            if(n-cur>=0){
                dfs(n-cur, cur, count+1);
            }
            else{
                dfs(n, cur-1, count);
            }
        } else{
            dfs(n, cur-1, count);
        }
    }
    // error
}
