package bitmanipulation._77_hamming_distance_461;

public class Practice4 {
    public int hammingDistance(int x, int y) {
        int result = x ^y;

        return Integer.bitCount(result);
    }
    // 0ms
}
