package kakao_2022._97_k진수에서소수개수구하기;

public class Practice1 {
    public int solution(int n, int k) {
        // k진수로 변환
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n %k);
            n /=k;
        }
        sb.reverse();
        String[] values =sb.toString().split("0");

        int result =0;
        for(String value : values){
            if(!value.isEmpty()){
                long num =  Long.parseLong(value);
                if(num ==2 || num ==3){
                    result++;
                }
                boolean check =false;
                for(int i=3; i<num; i++){
                    check = true;
                    if(num%i == 0){
                        check =false;
                        break;
                    }
                }

                if(check){
                    result++;
                }
            }
        }

        return result;
    }
    // 정확성  테스트
    //테스트 1 〉	실패 (시간 초과)
    //테스트 2 〉	통과 (0.27ms, 74.6MB)
    //테스트 3 〉	통과 (0.19ms, 77MB)
    //테스트 4 〉	통과 (0.13ms, 73MB)
    //테스트 5 〉	통과 (0.11ms, 74.6MB)
    //테스트 6 〉	통과 (0.16ms, 74.1MB)
    //테스트 7 〉	통과 (0.12ms, 80.1MB)
    //테스트 8 〉	통과 (0.16ms, 73.9MB)
    //테스트 9 〉	통과 (0.12ms, 75.4MB)
    //테스트 10 〉	통과 (0.12ms, 72.6MB)
    //테스트 11 〉	통과 (0.08ms, 75.8MB)
    //테스트 12 〉	통과 (0.17ms, 75MB)
    //테스트 13 〉	통과 (0.12ms, 74.2MB)
    //테스트 14 〉	통과 (0.10ms, 76.4MB)
    //테스트 15 〉	통과 (0.08ms, 76MB)
    //테스트 16 〉	통과 (0.13ms, 75.8MB)
    //채점 결과
    //정확성: 88.1
    //합계: 88.1 / 100.0
}
