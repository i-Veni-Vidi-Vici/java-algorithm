package bitmanipulation._78_sum_of_two_integers_371;

public class Practice3 {
    public int getSum(int a, int b) {
        char[] valueA = String.format("%032s",Integer.toBinaryString(a)).toCharArray();
        char[] valueB = String.format("%032s",Integer.toBinaryString(b)).toCharArray();

        int result =0;
        int carry =0;
        for(int i=31; i>=0; i--){
            int numA = Character.getNumericValue(valueA[i]);
            int numB = Character.getNumericValue(valueB[i]);
            if((numA^numB^carry) == 1) {
                result += Math.pow(2, 31-i);
            }
            if((numA & numB )+ (numA & carry )+ (numB & carry) >= 1){
                carry = 1;
            }else carry =0;

        }

        return result;
    }
    // error
}
