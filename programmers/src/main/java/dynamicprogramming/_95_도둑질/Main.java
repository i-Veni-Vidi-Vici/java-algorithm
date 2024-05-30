package dynamicprogramming._95_도둑질;

public class Main {
    public int solution(int[] money) {

        int prev =Math.max(money[0], money[1]);

        int pprev = money[0];
        for (int i = 2; i < money.length-1; i++) {
            int temp = prev;
            prev = Math.max(prev, pprev + money[i]);
            pprev = temp;
        }

        int first = prev;

        prev = Math.max(money[1], money[2]);
        pprev = money[1];
        for (int i = 3; i < money.length; i++) {
            int temp = prev;
            prev = Math.max(prev, pprev + money[i]);
            pprev = temp;
        }

        return Math.max(first, prev);
    }

    // 효율성  테스트
    //테스트 1 〉	통과 (12.19ms, 95.9MB)
    //테스트 2 〉	통과 (12.46ms, 95MB)
    //테스트 3 〉	통과 (12.53ms, 95.2MB)
    //테스트 4 〉	통과 (12.34ms, 95.5MB)
    //테스트 5 〉	통과 (13.03ms, 93.3MB)
    //테스트 6 〉	통과 (12.12ms, 95.1MB)
    //테스트 7 〉	통과 (12.61ms, 71.9MB)
    //테스트 8 〉	통과 (11.84ms, 72.6MB)
    //테스트 9 〉	통과 (21.66ms, 112MB)
    //테스트 10 〉	통과 (12.43ms, 95.1MB)
}
