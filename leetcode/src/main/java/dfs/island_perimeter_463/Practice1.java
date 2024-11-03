package dfs.island_perimeter_463;

public class Practice1 {
    public int islandPerimeter(int[][] grid) {
        int result =0;
        for(int y =0; y<grid.length; y++){
            for(int x= 0; x<grid[y].length; x++){
                if(grid[y][x] == 1){
                    if((x+1<grid[y].length && grid[y][x+1] == 1)){
                        result+=2;
                    }  else{
                        result +=4;
                    }
                    if(y+1<grid.length && grid[y+1][x] ==1 ){
                        result -=2;
                    }
                }
            }
        }

        return result;
    }
    // 4ms
}
