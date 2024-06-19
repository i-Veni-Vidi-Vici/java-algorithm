package bitmanipulation._77_hamming_distance_461;

public class Practice2 {
    public static int hammingDistance(int x, int y) {
        int value = x^y;
        int result=0;
        int divide = (int)Math.pow(2, 30);
        while (value> 0) {
            if (value / divide > 0) {
                result++;
                value -= divide;
                divide/=2;
            } else {
                divide/=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        hammingDistance(93, 73);
    }

    // 0ms
}
