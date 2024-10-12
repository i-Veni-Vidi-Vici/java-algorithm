package dynamicprogramming._95_도둑질;

public class Practice3 {
    public int solution(int[] money) {
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];

        dp1[0] = money[0];
        dp1[1] =  Math.max(dp1[0], money[1]);

        dp2[1] = money[1];
        dp2[2] = Math.max(dp2[1], money[2]);

        for(int i=2; i<money.length; i++){
            if(i<money.length-1){
                dp1[i] = Math.max(dp1[i-1], dp1[i-2]+ money[i]);
            }
            if(i>2){
                dp2[i] = Math.max(dp2[i-1], dp2[i-2]+ money[i]);
            }
        }

        return Math.max(dp1[dp1.length-2], dp2[dp2.length-1]);
    }
    // 효율성  테스트
    //테스트 1 〉	통과 (28.35ms, 103MB)
    //테스트 2 〉	통과 (27.26ms, 102MB)
    //테스트 3 〉	통과 (28.16ms, 103MB)
    //테스트 4 〉	통과 (27.61ms, 120MB)
    //테스트 5 〉	통과 (27.15ms, 100MB)
    //테스트 6 〉	통과 (28.18ms, 102MB)
    //테스트 7 〉	통과 (24.20ms, 75.8MB)
    //테스트 8 〉	통과 (24.51ms, 76.4MB)
    //테스트 9 〉	통과 (26.10ms, 94.2MB)
    //테스트 10 〉	통과 (27.46ms, 102MB)
    //채점 결과
    //정확성: 50.0
    //효율성: 50.0
    //합계: 100.0 / 100.0
}
