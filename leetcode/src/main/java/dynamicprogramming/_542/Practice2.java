package dynamicprogramming._542;

public class Practice2 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        dfs(mat, 0, 0, result, 0);
        return result;
    }

    private int dfs(int[][] mat, int x, int y, int[][] result, int count){
        if(!(x>=0 && y>=0 && x<mat[0].length && y<mat.length)){
            return Integer.MAX_VALUE;
        }
        if(y!= 0 && x!= 0 && mat[y][x]==0){

            return count;
        }

        for(int i=y; i<mat.length; i++){
            for(int j=x; j<mat[y].length; j++){
                if(result[y][x] ==0 && mat[y][x]== 1  ){
                    int right =dfs(mat, x+1, y, result, count+1 );
                    int left = dfs(mat, x-1, y, result, count+1 );
                    int top = dfs(mat, x, y-1, result, count+1 );
                    int bottom = dfs(mat, x, y+1, result, count+1 );

                    result[y][x]=Math.min(right, Math.min(left, Math.min(top, bottom)));
                    System.out.println(result[y][x]);
                }
            }
        }


        return count;
    }
    // error
}
