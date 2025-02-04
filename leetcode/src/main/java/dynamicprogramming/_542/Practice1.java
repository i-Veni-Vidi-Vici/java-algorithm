package dynamicprogramming._542;

public class Practice1 {
    public int[][] updateMatrix(int[][] mat) {
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    mat[i][j]=-1;
                }
            }
        }
        dfs(mat, 0, 0);
        return mat;
    }

    public int dfs(int[][] mat, int x, int y){
        if(!(x>=0 && x<mat.length && y>=0 &&y<mat[0].length)){
            return Integer.MAX_VALUE;
        }
        if(mat[x][y]>=0 && mat[x][y]!= Integer.MAX_VALUE ){
            return mat[x][y];
        }

        int left = dfs(mat, x-1, y);
        System.out.println(left+ " " + x+ " "+ y);
        int right = dfs(mat, x+1, y);
        System.out.println(right);
        int up = dfs(mat, x, y-1);
        int down = dfs(mat, x, y+1);

        return mat[x][y]= Math.min(left, Math.min(right, Math.min(up, down)));
    }
    // error
}
