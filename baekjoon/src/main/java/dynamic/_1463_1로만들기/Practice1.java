package dynamic._1463_1로만들기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

    public class Main{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int count =0;
            while(x !=1){
                if(x%3 ==0){
                    x/=3;
                }else if(x%2 ==0){
                    x/=2;
                }else{
                    x-=1;
                }
                count++;
            }


            System.out.println(count);
        }
    }
    // error
}
