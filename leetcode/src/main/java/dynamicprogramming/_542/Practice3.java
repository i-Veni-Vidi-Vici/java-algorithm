package dynamicprogramming._542;

public class Practice3 {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new ArrayDeque<>();
        int[][] result = new int[mat.length][mat[0].length];

        for(int i =0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i, j});
                }
            }
        }
        int[][] num = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        while(queue.isEmpty()){
            int[] val = queue.poll();
            int x = val[1];
            int y = val[0];

            for(int i=0; i<4; i++){
                if( x+num[i][0]>=0 && x+num[i][0]<mat.length && y+num[i][1] >=0 && y+num[i][1] <mat[0].length){
                    if(mat[  y+num[i][1]] [x+num[i][0]]== 1){
                        queue.add(new int[]{ y+num[i][1], x+num[i][0]});
                        result[y+num[i][1]][x+num[i][0]] = result[y][x]+1;
                    }
                }
            }

        }

        return result;
    }

    // error
}
