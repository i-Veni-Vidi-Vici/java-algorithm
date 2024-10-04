package dynamicprogramming._91_fibonacci_number_509;

public class Practice3 {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fib(n-1)+ fib(n-2);
    }

    // 10ms
}
