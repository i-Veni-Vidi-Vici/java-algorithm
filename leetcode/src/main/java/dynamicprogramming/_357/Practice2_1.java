package dynamicprogramming._357;

public class Practice2_1 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;

        int result = 10;
        int cur = 9;
        int ch = 9;

        for(int i=2; i<=n; i++){
            cur*= ch;
            ch--;
            result += cur;
        }

        return result;
    }
    // 0ms
}
