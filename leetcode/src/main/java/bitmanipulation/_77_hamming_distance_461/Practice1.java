package bitmanipulation._77_hamming_distance_461;

public class Practice1 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    // 0ms
}
