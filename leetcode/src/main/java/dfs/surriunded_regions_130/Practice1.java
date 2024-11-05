package dfs.surriunded_regions_130;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public void solve(char[][] board) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int y =0; y<board.length; y++){
            if(y==0 || y==board.length-1){
                for(int x=0; x<board[y].length; x++){
                    if(board[y][x]== 'O'){
                        search(board, x, y, map);
                    }
                }
            } else{
                if(board[y][0]== 'O'){
                    search(board,0, y, map);
                }
                if(board[y][board[y].length-1]== 'O'){
                    search(board,board[y].length-1,y, map );
                }
            }
        }


        for(int y=1; y<board.length-1; y++){
            for(int x=1; x<board[y].length-1; x++){
                if(board[y][x]== 'O' &&!map.containsKey(x*1000+y)){
                    board[y][x] = 'X';
                }
            }
        }

    }

    private void search(char[][] board, int x, int y, Map<Integer, Integer> map) {
        if(x<0 || y<0 || y>=board.length || x>=board[y].length){
            return;
        }
        if(board[y][x]== 'O' && !map.containsKey(x*1000+y)){
            System.out.println(x +","+y);
            map.put((x*1000 + y), 1);
        }else{
            return;
        }

        search(board, x+1, y, map);
        search(board, x, y+1, map);
        search(board, x-1, y, map);
        search(board, x, y-1, map);
    }
    // 21ms
}
