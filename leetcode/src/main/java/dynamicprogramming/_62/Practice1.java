package dynamicprogramming._62;

public class Practice1 {
    int sum =0;
    public int uniquePaths(int m, int n) {
        dfs(m-1, n-1);
        return sum;
    }

    public void dfs(int m, int n){
        if(m==0 && n==0){
            sum++;
            return;
        }

        if(n>0){
            dfs(m, n-1 );
        }


        if(m>0){
            dfs(m-1, n);
        }

    }
    // Time Limit Exceeded
}
