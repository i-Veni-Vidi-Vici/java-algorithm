package dynamicprogramming._542;

public class Practice1_1 {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new ArrayDeque<>();
        int[][] result = new int[mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]== 0){
                    queue.add(new int[]{i, j});
                }else{
                    result[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dist = {{-1,0}, {1,0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty()){
            int[] val = queue.poll();

            for(int[] num : dist){
                int y= val[0] + num[0];
                int x= val[1] + num[1];

                if(x>=0 && y>=0 && x<mat[0].length && y<mat.length){
                    if(result[y][x]> result[val[0]][val[1]] +1){
                        queue.add(new int[]{y, x});
                        result[y][x] =result[val[0]][val[1]] +1;
                    }

                }
            }
        }

        return result;
    }

    // 14ms
}
