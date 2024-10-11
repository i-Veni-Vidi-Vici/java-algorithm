package dynamicprogramming._95_도둑질;

public class Practice2 {
    public int solution(int[] money) {
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];

        dp1[0] = money[0];
        dp1[1] = Math.max(money[0], money[1]);
        dp2[1] = money[1];
        dp2[2] = Math.max(money[1], money[2]);
        for(int i=2; i<money.length; i++){
            if(i<money.length-1){
                dp1[i]= Math.max(dp1[i-1], dp1[i-2]+ money[i]);
            }
            if(i>2){
                dp2[i]= Math.max(dp2[i-1], dp2[i-2]+ money[i]);
            }
        }

        return Math.max(dp1[dp1.length-2], dp2[dp2.length-1]);
    }
}
// 효율성  테스트
//테스트 1 〉	통과 (28.59ms, 103MB)
//테스트 2 〉	통과 (27.34ms, 120MB)
//테스트 3 〉	통과 (28.31ms, 103MB)
//테스트 4 〉	통과 (28.38ms, 102MB)
//테스트 5 〉	통과 (26.77ms, 98.8MB)
//테스트 6 〉	통과 (28.08ms, 102MB)
//테스트 7 〉	통과 (24.78ms, 89.2MB)
//테스트 8 〉	통과 (25.12ms, 89.7MB)
//테스트 9 〉	통과 (26.61ms, 93.8MB)
//테스트 10 〉	통과 (28.06ms, 102MB)
//채점 결과
//정확성: 50.0
//효율성: 50.0
//합계: 100.0 / 100.0