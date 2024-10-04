package dynamicprogramming._91_fibonacci_number_509;

public class Practice4 {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 ){
            return 1;
        }

        int second =1;
        int result=1;
        for(int i=2; i<n; i++){
            int tmp = result;
            result = result +second;
            second = tmp;
        }

        return result;
    }

    public static void main(String[] args) {
        fib(4);
    }

    // 0ms
}

