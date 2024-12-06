package dynamic._2839_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

    public static int practice(int n) {
        int five = n / 5;
        int three = (n % 5) == 3 ? 1 : -1;
        if (three == -1) {
            return -1;
        }
        return five + three;
    }

    public static void main(String[] args) throws IOException {  // IOException도 추가해야 합니다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(practice(n));
    }

    // error
}
