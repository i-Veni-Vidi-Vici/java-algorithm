package bitmanipulation._77_hamming_distance_461;

public class Practice3 {
    public int hammingDistance(int x, int y) {
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        int result =0;
        while(max>0){
            if((max%2) != (min%2)){
                result++;
            }
            max/=2;
            min/=2;
        }
        return result;
    }

    // 0ms
}
