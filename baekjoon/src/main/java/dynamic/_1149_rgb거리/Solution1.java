package dynamic._1149_rgb거리;

import java.util.*;
import java.io.*;

public class Solution1 {
    class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[][] house = new int[N][3];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++) {
                    house[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int red = house[0][0];
            int blue = house[0][1];
            int green = house[0][2];

            for(int i=1; i<N; i++){
                int prevRed = red;
                int prevBlue = blue;
                int prevGreen = green;
                red = Math.min(prevBlue, prevGreen) + house[i][0];
                blue = Math.min(prevRed, prevGreen) + house[i][1];
                green = Math.min(prevRed, prevBlue) + house[i][2];
            }

            System.out.println(Math.min(red, Math.min(blue, green)));
        }
    }
    // 116ms
}
