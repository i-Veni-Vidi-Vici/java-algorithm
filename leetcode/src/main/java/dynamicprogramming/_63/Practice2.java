package dynamicprogramming._63;

public class Practice2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int i=0; i<obstacleGrid.length; i++){
            for(int j=0; j<obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j]== 1){
                    obstacleGrid[i][j]=-1;
                }
            }
        }

        for(int i=0; i<obstacleGrid.length; i++){
            if(obstacleGrid[i][0]==-1){
                break;
            }
            obstacleGrid[i][0]=1;
        }

        for(int i=0; i<obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i]==-1){
                break;
            }
            obstacleGrid[0][i]=1;
        }

        for(int i=1; i<obstacleGrid.length; i++){
            for(int j=1; j<obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j]!= -1){
                    if(obstacleGrid[i-1][j]>0)
                        obstacleGrid[i][j]+= obstacleGrid[i-1][j];
                    if(obstacleGrid[i][j-1]>0)
                        obstacleGrid[i][j]+= obstacleGrid[i][j-1];
                }
            }
        }
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==-1){
            return 0;
        }

        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    // 1ms
}
