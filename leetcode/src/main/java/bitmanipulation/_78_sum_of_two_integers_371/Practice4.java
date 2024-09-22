package bitmanipulation._78_sum_of_two_integers_371;

public class Practice4 {
    public static int getSum(int a, int b) {
        char[] valueA = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0').toCharArray();
        char[] valueB = String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0').toCharArray();

        int carry =0;
        StringBuilder sb = new StringBuilder();
        for(int i=31; i>=0; i--){
            int A = Character.getNumericValue(valueA[i]);
            int B = Character.getNumericValue(valueB[i]);
            int xor = A ^ B;

            if((xor ^ carry) == 1){
                sb.append(1);
            } else sb.append(0);
            if(((A&B)| (xor& carry)) == 1 ){
                carry =1;
            }else carry =0;
        }

        sb.reverse();

        return Integer.parseUnsignedInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseUnsignedInt("11111111111111111111111111101100", 2));
        getSum(1, 2);
    }
    // 3ms
}
