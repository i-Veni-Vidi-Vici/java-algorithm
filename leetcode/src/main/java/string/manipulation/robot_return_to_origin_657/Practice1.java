package string.manipulation.robot_return_to_origin_657;

public class Practice1 {
    public boolean judgeCircle(String moves) {
        int x =0;
        int y =0;
        for(char c :  moves.toCharArray()){
            if(c=='L'){
                x -=1;
            } else if(c== 'R'){
                x+=1;
            }else if(c== 'U'){
                y+=1;
            }else if(c== 'D'){
                y-=1;
            }
        }

        return x==0 && y==0;
    }
    // 4ms
}
