package dynamic._9095_123더하기;
import java.util.Scanner;

public class Practice1 {

    public class Main{
        static int sum=0;
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                dfs(n, 0);
                System.out.println(sum);
                sum =0;
            }
        }
        public static void dfs(int n,int current){
            if(current==n){
                sum++;
                return;
            }

            if(current+1<=n){
                dfs(n, current+1);
            }
            if(current+2<=n){
                dfs(n, current+2);
            }
            if(current+3<=n){
                dfs(n, current+3);
            }
        }
    }
    // 176ms
}
