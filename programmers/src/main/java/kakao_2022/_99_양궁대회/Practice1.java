package kakao_2022._99_양궁대회;

import java.util.*;

public class Practice1 {
    static int   max = 0;
    static int[] result;
    public static int[] solution(int n, int[] info) {
        dfs(0,n, info, new int[11]);
        if (max == 0)
            return new int[]{-1};
        return result;
    }
    private static void dfs(int index, int arrow, int[] info, int[] lion){
        if(index == 11){
            lion[10]+=arrow;
            int sum=0;
            for(int i=0; i<lion.length; i++){
                if(info[i]<lion[i]){
                    sum+=10-i;
                } else if(info[i]== 0 && lion[i]==0){
                    continue;
                }
                else{
                    sum -= 10-i;
                }
            }
            if(max<sum){
                System.out.println(sum);
                max = sum;
                result = Arrays.copyOf(lion, lion.length);
            }
            else if (sum == max) {
                for (int i = 10; i >= 0; i--) {
                    if (lion[i] == result[i])
                        continue;
                    // 뒤에서부터 더 많이 맞힌 경우 정답 교체
                    if (lion[i] > result[i])
                        result = Arrays.copyOf(lion, lion.length);
                    break;
                }
            }

            return;
        }

        if(info[index]<arrow){
            lion[index]= info[index]+1;

            dfs(index+1, arrow- lion[index], info, lion);
            lion[index]=0;

        }
        dfs(index+1, arrow, info, lion);

    }

    public static void main(String[] args) {
        solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0});
    }


    // 정확성  테스트
    //테스트 1 〉	통과 (0.02ms, 84.6MB)
    //테스트 2 〉	실패 (0.05ms, 77.5MB)
    //테스트 3 〉	실패 (0.12ms, 75.5MB)
    //테스트 4 〉	실패 (0.04ms, 77.6MB)
    //테스트 5 〉	통과 (0.05ms, 71.9MB)
    //테스트 6 〉	통과 (0.05ms, 74.2MB)
    //테스트 7 〉	통과 (0.04ms, 78.1MB)
    //테스트 8 〉	통과 (0.03ms, 75.8MB)
    //테스트 9 〉	실패 (0.04ms, 74.3MB)
    //테스트 10 〉	실패 (0.03ms, 75.4MB)
    //테스트 11 〉	통과 (0.03ms, 78.4MB)
    //테스트 12 〉	실패 (0.03ms, 72.5MB)
    //테스트 13 〉	실패 (0.03ms, 76.6MB)
    //테스트 14 〉	통과 (0.04ms, 83.9MB)
    //테스트 15 〉	실패 (0.07ms, 75.2MB)
    //테스트 16 〉	실패 (0.03ms, 76.9MB)
    //테스트 17 〉	통과 (0.02ms, 77.7MB)
    //테스트 18 〉	통과 (0.03ms, 80.2MB)
    //테스트 19 〉	실패 (0.02ms, 72.9MB)
    //테스트 20 〉	실패 (0.06ms, 78.3MB)
    //테스트 21 〉	실패 (0.04ms, 75.7MB)
    //테스트 22 〉	실패 (0.04ms, 73MB)
    //테스트 23 〉	실패 (0.02ms, 75.1MB)
    //테스트 24 〉	통과 (0.21ms, 85MB)
    //테스트 25 〉	통과 (0.32ms, 74.2MB)
    //채점 결과
    //정확성: 46.4
    //합계: 46.4 / 100.0
}
