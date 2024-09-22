package bitmanipulation._80_number_of_1_bits_191;

public class Practice3 {
    public int hammingWeight(int n) {
        int result=0;
        while(n>0){
            result +=n%2;
            n/=2;
        }

        return result;
    }

    // 0ms
}
