package bitmanipulation._77_hamming_distance_461;

public class Main1 {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int sum = 0;

        while (result != 0) {
            sum += result % 2;
            result /=2;
        }

        return sum;
    }

    // 0ms
}
