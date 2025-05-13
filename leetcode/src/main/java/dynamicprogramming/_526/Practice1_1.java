package dynamicprogramming._526;

public class Practice1_1 {
    public int countArrangement(int n) {
        return dfs(n, 1, new boolean[n+1]);
    }

    private int dfs(int n, int num,  boolean[] vistied){
        if(num>n){
            return 1;
        }

        int count = 0;
        for(int i=1; i<=n; i++){
            if(!vistied[i] && (i%num == 0 || num%i== 0)){
                vistied[i]= true;
                count += dfs(n, num+1, vistied);
                vistied[i]= false;
            }

        }

        return count;
    }
    // 43ms
}
