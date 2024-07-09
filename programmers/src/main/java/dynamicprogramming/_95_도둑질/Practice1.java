package dynamicprogramming._95_도둑질;

public class Practice1 {
    public int solution(int[] money) {
        int[] dp1 = new int[money.length-1];
        int[] dp2 = new int[money.length];

        dp1[0] = money[0];
        dp2[0] = 0;

        dp1[1] = Math.max(money[0], money[1]);
        dp2[1] = money[1];
        for (int i = 2; i < money.length-1; i++) {
                dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + money[i]);
                dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] +money[i]);
        }
        dp2[money.length-1] = Math.max(dp2[money.length - 2], dp2[money.length - 3] +money[money.length-1]);

        return Math.max(dp1[money.length - 2], dp2[money.length - 1]);
    }
    //테스트 1 〉	통과 (27.51ms, 103MB)
    //테스트 2 〉	통과 (26.98ms, 101MB)
    //테스트 3 〉	통과 (27.21ms, 102MB)
    //테스트 4 〉	통과 (28.00ms, 103MB)
    //테스트 5 〉	통과 (27.66ms, 99.7MB)
    //테스트 6 〉	통과 (27.66ms, 102MB)
    //테스트 7 〉	통과 (20.08ms, 89.4MB)
    //테스트 8 〉	통과 (21.36ms, 89.7MB)
    //테스트 9 〉	통과 (23.90ms, 93.9MB)
    //테스트 10 〉	통과 (27.35ms, 102MB)
}
