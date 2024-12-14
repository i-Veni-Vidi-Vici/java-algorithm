package dynamicprogramming.counting_bits_338;

public class Practice1 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++){
            result[i]= Integer.bitCount(i);
        }

        return result;
    }
    // 3ms
}
