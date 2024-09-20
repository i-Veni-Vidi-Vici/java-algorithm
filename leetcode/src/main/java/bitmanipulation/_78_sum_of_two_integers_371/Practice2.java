package bitmanipulation._78_sum_of_two_integers_371;

import java.util.Arrays;
import java.util.Comparator;

public class Practice2 {
    public int getSum(int a, int b) {
        String[] abin =Integer.toBinaryString(a).split("");
        Arrays.sort(abin, Comparator.reverseOrder());
        String[] bbin =Integer.toBinaryString(b).split("");
        Arrays.sort(bbin, Comparator.reverseOrder());

        int result =0;
        int length = Math.max(abin.length, bbin.length);
        int carry =0;
        for(int i=0; i<length; i++){
            if (i >= abin.length) {
                while (i<length){
                    if (bbin[i].equals("1")) {
                        result += Math.pow(2,i);
                        i++;
                    }
                }
                break;
            }else if(i>= bbin.length) {
                while (i<length){
                    if (abin[i].equals("1")) {
                        result += Math.pow(2,i);
                        i++;
                    }
                }
                break;
            }
            if((Integer.parseInt(abin[i]) ^ Integer.parseInt(bbin[i])^ carry) ==1){
                result += Math.pow(2,i);
            }
            if((abin[i].equals("1") && carry == 1) || (bbin[i].equals("1")&& carry==1)){
                carry =1;
            }else carry =0;
        }


        return result;
    }
    // Time Limit Exceeded
}
