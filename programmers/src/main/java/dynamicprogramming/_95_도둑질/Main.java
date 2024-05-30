package dynamicprogramming._95_도둑질;

public class Main {
    public int solution(int[] money) {

        int prev =Math.max(money[0], money[1]);
        if (prev == money[0]) {

        }
        int pprev = money[0];
        for (int i = 2; i < money.length; i++) {
            int temp = prev;
            prev = Math.max(prev, pprev + money[i]);
            pprev = temp;
        }

        return prev;
    }

    // error
}
