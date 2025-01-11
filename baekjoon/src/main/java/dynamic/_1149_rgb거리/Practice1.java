package dynamic._1149_rgb거리;
import java.util.*;

public class Practice1 {
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[][] house = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    house[i][j] = sc.nextInt();
                }
            }

            int red =house[0][0];
            int blue = house[0][1];
            int green =house[0][2];

            for(int i=1; i<N; i++){
                red = Math.min(blue, green);
                blue = Math.min(red, green);
                green = Math.min(blue, red);

                red +=house[i][0];
                blue +=house[i][1];
                green +=house[i][2];

            }

            System.out.println(Math.min(red, Math.min(blue, green)));
        }
        // error
    }
}
