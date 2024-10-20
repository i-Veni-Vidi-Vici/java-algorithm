package kakao_2022._99_양궁대회;

import java.util.*;

public class Practice2 {
    int max =0;
    int[] lion = new int[11];
    public int[] solution(int n, int[] info) {
        int[] result = new int[11];
        dfs(0,n, info, result);

        if(max == 0){
            return new int[]{-1};
        }

        return lion;
    }

    private void dfs(int index,int arrow, int[] info, int[] result){
        if(index ==11){
            // 합 구하기
            int sum =0;
            result[10]+= arrow;
            for(int i=0; i<result.length; i++){
                if(info[i]<result[i]){
                    sum+= 10-i;
                }else if(info[i]== 0 &result[i]==0){
                    continue;
                } else{
                    sum-= 10-i;
                }
            }

            // 최대값 구하기
            if(max< sum){
                max = sum;
                lion= Arrays.copyOf(result, result.length);
            } else if( max == sum){
                for(int i=10; i>=0; i--){
                    if(lion[i]< result[i]){
                        lion = Arrays.copyOf(result, result.length);
                    }else if(lion[i]>result[i]){
                        break;
                    }
                }
            }
            return;
        }

        if(info[index]<arrow){
            result[index]+=info[index]+1;
            dfs(index+1, arrow - result[index], info, result);
            result[index] =0;
        }
        dfs(index+1, arrow , info, result);
        result[index] =0;
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (0.08ms, 81.2MB)
    //테스트 2 〉	통과 (0.66ms, 75.7MB)
    //테스트 3 〉	통과 (0.58ms, 75.9MB)
    //테스트 4 〉	통과 (0.28ms, 78MB)
    //테스트 5 〉	통과 (0.65ms, 72.4MB)
    //테스트 6 〉	통과 (0.67ms, 71.5MB)
    //테스트 7 〉	통과 (0.28ms, 73.9MB)
    //테스트 8 〉	통과 (0.14ms, 74MB)
    //테스트 9 〉	통과 (0.28ms, 73.8MB)
    //테스트 10 〉	통과 (0.13ms, 77.5MB)
    //테스트 11 〉	통과 (0.19ms, 73.8MB)
    //테스트 12 〉	통과 (0.21ms, 76.8MB)
    //테스트 13 〉	통과 (0.44ms, 74.8MB)
    //테스트 14 〉	통과 (0.56ms, 75.4MB)
    //테스트 15 〉	통과 (0.59ms, 76.2MB)
    //테스트 16 〉	통과 (0.34ms, 80.1MB)
    //테스트 17 〉	통과 (0.28ms, 76MB)
    //테스트 18 〉	통과 (0.06ms, 87.8MB)
    //테스트 19 〉	통과 (0.03ms, 76.3MB)
    //테스트 20 〉	통과 (0.63ms, 77.1MB)
    //테스트 21 〉	통과 (0.68ms, 77.1MB)
    //테스트 22 〉	통과 (0.68ms, 78.1MB)
    //테스트 23 〉	통과 (0.11ms, 67.2MB)
    //테스트 24 〉	통과 (0.67ms, 74MB)
    //테스트 25 〉	통과 (0.96ms, 77.3MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
