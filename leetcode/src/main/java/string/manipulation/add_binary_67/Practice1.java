package string.manipulation.add_binary_67;

import java.util.Arrays;
import java.util.Collections;

public class Practice1 {
    public String addBinary(String a, String b) {
        String[] val1= a.split("");
        String[] val2 = b.split("");

        long num1 = 0;
        long num2 = 0;
        for(int i= val1.length-1; i>=0; i--){
            if(val1[i].equals("1")){
                num1 += Math.pow(2, val1.length-1-i);
            }
        }

        for(int i= val2.length-1; i>=0; i--){
            if(val2[i].equals("1")){
                num2 += Math.pow(2, val2.length-1-i);
            }
        }

        return Long.toBinaryString(num1+num2);
    }
    // error
}
