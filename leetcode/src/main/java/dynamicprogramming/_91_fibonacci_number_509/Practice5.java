package dynamicprogramming._91_fibonacci_number_509;

public class Practice5 {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int second =1;
        int result =1;
        for(int i=2; i<n; i++){
            int tmp = result;
            result += second;
            second =tmp;
        }

        return result;
    }

    // 0ms
}
